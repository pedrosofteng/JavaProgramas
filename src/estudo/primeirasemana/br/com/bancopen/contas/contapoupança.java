package estudo.primeirasemana.br.com.bancopen.contas;

public class contapoupança extends conta {
    // extends para herdar os atributos e métodos da classe mãe
    private String mensagem = """
            Você é premium.""";

    public String getMensagem() {
        return mensagem;
    }

    // tem @Override, quer dizer que peguei esse método da mãe,
    // e estou modificando ele
    @Override
    public double getSaldo() {
        return super.getSaldo();
        // super. para pegar da SuperClasse
    }
}
