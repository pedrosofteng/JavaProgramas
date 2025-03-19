package estudo.segundasemana.construtoresarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<String> nomeDosProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Maça", 4.79, 90);
        Produto produto2 = new Produto("Abacaxi", 8.99, 120);
        Produto produto3 = new Produto("Limão", 5.99, 200);
        ProdutoPerecivel produto1Pereciveis = new ProdutoPerecivel("Carne de Boi",
                29.90, 20, "29/09");

        nomeDosProdutos.add("Alface");
        nomeDosProdutos.add("Toddynho");
        nomeDosProdutos.add("Carne de boi");
        nomeDosProdutos.add("Morango");
        nomeDosProdutos.add("Amendoim 300g");
        nomeDosProdutos.add("Whisky");
        nomeDosProdutos.add("Vinho");
        nomeDosProdutos.add("Mortandela");

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto1Pereciveis);

        System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println("\nItem número 2 da lista" + produtos.get(1).exibirInformacoes());

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto1Pereciveis);


        // foreach = loop que roda lista inteira
        // Produto = nome da classe mãe
        // nomeDoParametro = é o que vamos fazer com todos os itens da lista
        // se o item for produto1 = nomeDoParametro, produto1.getNome() ou
        // nomeDoParametro.getNome();
        // produtos = nome da lista
        for (Produto nomeDoParametro : produtos) {
            System.out.println(nomeDoParametro.getNome());
            if (nomeDoParametro instanceof ProdutoPerecivel produtoPerecivel) {
                System.out.println("Validade: " + produtoPerecivel.getValidade());
            }
        }
        // nomeDoParametro instanceof ProdutoPerecivel
        // se o nome da classe PERTENCER a classe ProdutoPerecivel, faça tal ação

        ProdutoPerecivel p1 = produto1Pereciveis;
        System.out.println(p1);
        // referenciar uma classe a outra.

        System.out.println(nomeDosProdutos);
        Collections.sort(nomeDosProdutos);
        System.out.println("Depois da organização: " + nomeDosProdutos);

        System.out.println(produtos);
        Collections.sort(produtos);
        System.out.println("Depois da organização: " + produtos);
    }
}
