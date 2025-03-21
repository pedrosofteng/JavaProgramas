package estudo.segundasemana.HttpRequestResponse.exercicios.exercicio4;

public class ErroConsultaGitHubException extends RuntimeException {
    String s;

    public ErroConsultaGitHubException(String s) {
        this.s = s;
    }

    @Override
    public String getMessage() {
        return this.s;
    }
}
