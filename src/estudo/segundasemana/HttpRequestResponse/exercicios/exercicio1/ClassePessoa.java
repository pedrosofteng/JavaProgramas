package estudo.segundasemana.HttpRequestResponse.exercicios.exercicio1;

public class ClassePessoa {
    private String nome;
    private int idade;
    private String cidade;

    public ClassePessoa(Pessoa pessoa) {
        this.nome = pessoa.nome();
        this.cidade = pessoa.cidade();
        this.idade = pessoa.idade();
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Cidade: " + cidade;
    }
}
