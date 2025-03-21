package estudo.segundasemana.HttpRequestResponse.exercicios.exercicio3;

public class Usuario {
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.length() > 8)
            throw new SenhaInvalidaException("Digite uma senha com até " +
                    "8 caracteres.");
        this.senha = senha;
    }
}
