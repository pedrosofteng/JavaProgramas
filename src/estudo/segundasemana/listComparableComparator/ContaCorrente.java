package estudo.segundasemana.listComparableComparator;

public class ContaCorrente extends ContaBancaria {
    String rendimento;

    public ContaCorrente(String nome, double saldo, int agencia, Banco banco,
                         String rendimento) {
        super(nome, saldo, agencia, banco);
        this.rendimento = rendimento;
    }
}
