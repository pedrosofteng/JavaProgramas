package estudo.segundasemana.HttpRequestResponse.omdb3Exception;

public class ErroConversaoAnoException extends RuntimeException {
    private String mensagem;

    // ele já vem extends Throwable, e sendo assim ele já é obrigado
    // a dar o try catch, a gente quer dar extends em uma classe
    // que é Unchecked Exceptions, não são checadas em tempo de execução

    // IOException (Checked Exception)
    // NullPointerException (Unchecked Exception)

    public ErroConversaoAnoException(String mensagem) {
        this.mensagem = mensagem;
    }
    // metodo para chamar o erro e mostrar uma mensagem


    public String getMensagem() {
        return mensagem;
    }
}
