package estudo.segundasemana.construtoresarraylist;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;
    private int quantidade;

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String exibirInformacoes () {
       return "\nNome: " + nome + "\nPreço: " +
                preco + "\nQuantidade: " + quantidade;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nPreço: " +
                preco + "\nQuantidade: " + quantidade;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return this.getNome().compareTo(outroProduto.getNome());
    }
    // vou comparar um nome, com outro nome
    // outroProduto é o parâmetro que vai receber a classe Produto

    /*@Override
    public int compareTo(Produto outroProduto) {
        return Integer.compare(this.getQuantidade(), outroProduto.getQuantidade());
    }*/

    /*@Override
    public int compareTo(Produto outroProduto) {
        return Double.compare(this.getPreco(), outroProduto.getPreco());
    }*/

    // PORQUE STRING NÃO USO String.compare???
    // PORQUE STRING NÃO É UM TIPO PRIMITIVO, É UMA CLASSE, QUE EM SUA DOCUMENTAÇÃO
    // POSSUI IMPLEMENTS Comparable<String>
    // AGORA OS TIPOS PRIMITIVOS NÃO SÃO CLASSES, NÃO TEM MÉTODOS E PRECISAM DA CLASSE
    // INTEGER E DOUBLE PARA COMPARAR SEUS VALORES, PARA USURFUIR DO MÉTODO.
    // OU SEJA, a classe string assinou o contrato dizendo que quer Comparable
    // os outros não, porque eles nem são classes.

}
