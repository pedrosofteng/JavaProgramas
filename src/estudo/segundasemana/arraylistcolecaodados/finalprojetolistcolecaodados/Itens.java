package estudo.segundasemana.arraylistcolecaodados.finalprojetolistcolecaodados;

public class Itens {
    String nome;
    double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nPreço: " + preco;
    }

    public Itens(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
