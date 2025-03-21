package estudo.segundasemana.HttpRequestResponse.exercicios.exercicio1;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String mensagem = """
                {
                  "nome": "Carlos Silva",
                  "idade": 28,
                  "cidade": "Belo Horizonte"
                }""";

        Pessoa pessoa = gson.fromJson(mensagem, Pessoa.class);

        System.out.println(pessoa);

        ClassePessoa pessoa2 = new ClassePessoa(pessoa);

        System.out.println(pessoa2);
    }
}
