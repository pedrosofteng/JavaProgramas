package estudo.segundasemana.pessoaarraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.incluirDados("Fernando", 18);
        pessoa2.incluirDados("Lucas", 20);
        pessoa3.incluirDados("Gabriel", 29);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        System.out.println("Quantidade das pessoas da lista: " + pessoas.size());
        System.out.println("Nome da primeira pessoa da lista: " +
                pessoas.get(0).getNome() + "\n");

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);

        System.out.println(pessoa1.toString());
    }
}
