package estudo.segundasemana.HttpRequestResponse.exercicios.exercicio4;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GitHubAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String busca = scanner.nextLine();

        busca = URLEncoder.encode(busca, StandardCharsets.UTF_8);
        // codifica e muda para ser adaptado por todos métodos URL padrão

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/users/" + busca))
                .build();
        // busca.replace(" ", "+") = posso fazer assim também

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        try {
            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado " +
                        "no GitHub.");
            }

            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Body: " + response.body());
            // como o statusCode é 404 ele nem executa essa parte de cima do try
            // não precisei de uma classe pra setar esse erro.

        } catch (ErroConsultaGitHubException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
