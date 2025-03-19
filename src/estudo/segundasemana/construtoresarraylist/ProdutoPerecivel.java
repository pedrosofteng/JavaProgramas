package estudo.segundasemana.construtoresarraylist;

public class ProdutoPerecivel extends Produto{
    private String validade;

    public String getValidade() {
        return validade;
    }

    public ProdutoPerecivel(String nome, double preco, int quantidade, String validade) {
        super(nome, preco, quantidade);
        this.validade = validade;
    }

    @Override
    public String toString() {
        return super.toString() + "\nValidade: " + validade + "\n";
    }
}
