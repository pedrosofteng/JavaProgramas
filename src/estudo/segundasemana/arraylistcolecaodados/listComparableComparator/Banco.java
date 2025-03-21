package estudo.segundasemana.arraylistcolecaodados.listComparableComparator;

public class Banco {
    private String nomeDoBanco;

    public Banco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    @Override
    public String toString() {
        return "\nBanco: " + nomeDoBanco;
    }
}
