package estudo.segundasemana.HttpRequestResponse.googlebooks;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooksAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Algumas exceções alguém tem que tratar, com throws,
        // Estou permitindo rodar com as exceções (vem do .send)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o nome do livro: ");
        var busca = scanner.nextLine();

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.googleapis.com/books/v1/volumes?q=" + busca +
                        "&key=AIzaSyAYqn07h2Qawr2MICTxiIwZh1xMrJhF4gQ"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}