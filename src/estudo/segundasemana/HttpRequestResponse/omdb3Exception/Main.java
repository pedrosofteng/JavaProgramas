package estudo.segundasemana.HttpRequestResponse.omdb3Exception;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            // Algumas exceções alguém tem que tratar, com throws,
            // Estou permitindo rodar com as exceções (vem do .send)
            Scanner scanner = new Scanner(System.in);
            System.out.print("Qual o nome do título: ");
            var busca = scanner.nextLine();

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.omdbapi.com/?t=" +
                            busca.replace(" ", "+") + "&apikey=b8b965e1"))
                    // top gun = top+gun
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            // muda a política de escrita dos atributos da classe record em questão
            // precisavamos de Title, tinhamos title, ele vai conseguir entregar
            // Title e não vamos precisar mudar o nome do atributo, da variável
            // por questões de boas práticas

            //Gson gson = new Gson();
            // preciso criar um gson para usar

            // Titulo meuTitulo = gson.fromJson(json, Titulo.class);
            TituloOMDb meuTituloOmdb = gson.fromJson(json, TituloOMDb.class);
            // quero transformar esse json na classe Título
            // as variáveis meuTitulo.getNome vou conseguir manipular os dados
            // que ele converteu de JSON -> Classe/Objeto JAVA

            System.out.println(meuTituloOmdb);

            // data transfer objetcs = record TituloOMDb
            // quero que ele integre na classe Titulo

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            // fica em vermelho no primeiro momento porque ele não tem um construtor
            // que receba o titulo MEUTITULOOMDB

            System.out.println(meuTitulo);
        } catch (NumberFormatException e) {
            System.out.print("Deu um erro na formatação dos dados: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.print("Deu um erro na url: ");
            System.out.println(e.getMessage());
        } catch (ErroConversaoAnoException e) {
            System.out.println(e.getMensagem());
        }

        // Object > Throwable > Exception > RuntimeException
        //                      or Error
        // Erro por exemplo de memória, não é tratável
        // Exception é tratável

        System.out.println("Finalizando programa.");
    }
}
