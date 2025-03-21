package estudo.segundasemana.HttpRequestResponse.exercicios.exercicio3;

public class SenhaInvalidaException extends RuntimeException {
    String mensagem;

    public SenhaInvalidaException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
}
