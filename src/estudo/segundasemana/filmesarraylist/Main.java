package estudo.segundasemana.filmesarraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Filme filme3 = new Filme();
        // criei 3 filmes
        ArrayList<Filme> filmes = new ArrayList<>();
        // criei uma lista da classe Filme
        // nome da lista é filmes

        filme1.setNome("Senhor dos Anéis 1");
        filme2.setNome("Senhor dos Anéis 2");
        filme3.setNome("Senhor dos Anéis 3");
        filme1.setNota(7);
        filme2.setNota(10);
        filme3.setNota(8);

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);
        // adicionei o nome dos 3 filmes que criei, com a classe Filme

        System.out.println("\nNúmero de filmes na lista: " + filmes.size() + "\n");

        System.out.println("Primeiro filme da lista: " + filmes.get(0).getNome());
        System.out.println("Nota do primeiro filme da lista: "
                + filmes.get(0).getNota() + "\n");
        // get(0) diz para pegar o primeiro item da lista, começa com 0 as listas

        System.out.println("Segundo filme da lista: " + filmes.get(1).getNome());
        System.out.println("Nota do segundo filme da lista: "
                + filmes.get(1).getNota() + "\n");

        System.out.println("Terceiro filme da lista: " + filmes.get(2).getNome());
        System.out.println("Nota do terceiro filme da lista: "
                + filmes.get(2).getNota() + "\n");
    }
}
