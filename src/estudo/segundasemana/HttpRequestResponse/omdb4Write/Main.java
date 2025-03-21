package estudo.segundasemana.HttpRequestResponse.omdb4Write;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        var busca = "";
        // como é var, precisa ser iniciada
        String resposta = "";
        // como o loop depende do que tem nessa var, precisa ser iniciada
        List<Titulo> lista = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting().create();
        // .setPrettyPrinting() = já ordena o arquivo JSON bonitinho

        while (!resposta.equalsIgnoreCase("sair")) {
            // ignoreCase serve pra ser se for, maiúsculo ou minúsculo
            // ele vai interpretar tudo como igual a sair.
            try {
                System.out.print("\nDeseja sair, ou buscar um título: ");
                resposta = scanner.nextLine();

                if (resposta.equalsIgnoreCase("sair")) {
                    break;
                }
                // se não tiver esse if, ele vai finalizar depois de rodar o programa
                // todo, ou seja, o while ele vai conferir se busca = sair
                // quando o programa voltar lá em cima, ele faz a conferência
                // antes de iniciar o programa, então é preciso de um if
                // pra interromper caso a primeira coisa seja sair

                System.out.print("\nQual o nome do título: ");
                busca = scanner.nextLine();
                busca = URLEncoder.encode(busca, StandardCharsets.UTF_8);


                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://www.omdbapi.com/?t=" +
                                busca + "&apikey=b8b965e1"))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                TituloOMDb meuTituloOmdb = gson.fromJson(json, TituloOMDb.class);

                System.out.println("MEU TITULO OMDB: ");
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);

                System.out.println("Meu Título: ");
                System.out.println(meuTitulo);

                lista.add(meuTitulo);
                // se acontecer algum erro ele nem vai chegar aqui

                /*FileWriter escrita = new FileWriter("C:\\Users\\Goiabinhas-PC" +
                        "\\OneDrive\\Área de Trabalho\\filmes.txt");
                // nome do arquivo + destino
                escrita.write(meuTitulo.toString());
                // precisa de algum parâmetro da Classe .algumaCoisa();
                escrita.close();
                // fechar a escrita*/

            } catch (NumberFormatException e) {
                System.out.print("Deu um erro na formatação dos dados: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.print("Deu um erro na url: ");
                System.out.println(e.getMessage());
            } catch (ErroConversaoAnoException e) {
                System.out.println(e.getMensagem());
            }
        }
        System.out.println(lista);

        FileWriter escrita = new FileWriter("filmes.json");
        // X:\\Users\\COMPUTADOR\\OneDrive\\Área de Trabalho\\ -> adicionar diretório
        escrita.write(gson.toJson(lista));
        escrita.close();

        System.out.println("Finalizando programa.");
    }
}
