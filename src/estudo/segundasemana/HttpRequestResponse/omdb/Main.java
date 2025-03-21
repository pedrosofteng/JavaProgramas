package estudo.segundasemana.HttpRequestResponse.omdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Algumas exceções alguém tem que tratar, com throws,
        // Estou permitindo rodar com as exceções (vem do .send)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o nome do título: ");
        var busca = scanner.nextLine();
        // var = string

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t=" + busca +
                        "&apikey=b8b965e1"))
                //dominio do site + busca + chave
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        // response = resposta do https
        // response.body() = é o corpo da resposta

        System.out.println(response.body());
    }
}
