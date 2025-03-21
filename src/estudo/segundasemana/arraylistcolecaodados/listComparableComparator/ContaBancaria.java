package estudo.segundasemana.arraylistcolecaodados.listComparableComparator;

public class ContaBancaria implements Comparable<ContaBancaria> {
    private String nome;
    private double saldo;
    private int agencia;
    private Banco nomeDoBanco;
    // Instanciar uma classe dentro de outra

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public Banco getNomeDoBanco() {
        return nomeDoBanco;
    }

    public ContaBancaria (String nome, double saldo, int agencia, Banco banco) {
        super();
        this.nome = nome;
        this.saldo = saldo;
        this.agencia = agencia;
        nomeDoBanco = banco;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nSaldo: " + saldo +
                "\nAgencia: " + agencia + nomeDoBanco;
    }

    @Override
    public int compareTo(ContaBancaria o) {
        return getNome().compareTo(o.getNome());
    }
}
