package estudo.primeirasemana.contabancaria;

public class ContaPlus extends ContaBancaria {
    private String mensagem = """
            Você é premium.""";

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public double getSaldo() {
        return super.getSaldo() + 1000;
    }
}
