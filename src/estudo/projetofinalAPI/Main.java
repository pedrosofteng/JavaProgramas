package estudo.projetofinalAPI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import estudo.projetofinalAPI.modelos.Cep;
import estudo.projetofinalAPI.modelos.CepRecord;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        String resposta = "";
        int busca;
        Scanner scanner = new Scanner(System.in);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Cep> lista = new ArrayList<>();

        while (!resposta.equalsIgnoreCase("sair")) {
            try {
                System.out.print("Deseja consultar ou sair? ");
                resposta = scanner.nextLine();

                if (resposta.equalsIgnoreCase("sair")) {
                    break;
                }

                System.out.print("\nEscreva um CEP com até 8 dígitos: ");
                busca = scanner.nextInt();

                if (String.valueOf(busca).length() > 8) {
                    System.out.println("Erro: CEP com mais de 8 dígitos.");
                } else if (String.valueOf(busca).length() < 8) {
                    System.out.println("Erro: CEP com menos de 8 dígitos.");
                }

                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://viacep.com.br/ws/" + String.valueOf(busca) + "/json/"))
                        .GET()
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                CepRecord cepRecord = gson.fromJson(response.body(), CepRecord.class);
                Cep cep = new Cep(cepRecord);

                System.out.println(cep);

                lista.add(cep);

            } catch (InputMismatchException e) {
                System.out.println("Número inválido.");
                e.getMessage();
            }

            scanner.nextLine();
            // consumir a quebra
        }

        System.out.println(lista);

        FileWriter escrita = new FileWriter("cep.json");
        escrita.write(gson.toJson(lista));
        escrita.close();
    }
}