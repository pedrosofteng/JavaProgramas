package estudo.segundasemana.pessoaconstrutores;

public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    // Não existe set, pois não quero que ele seja alterado além do construtor.

    // Metodo para exibir informações
    void exibirInformacoes() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }
}
