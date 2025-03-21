package estudo.segundasemana.arraylistcolecaodados.pessoaconstrutores;

public class Main {
    public static void main(String[] args) {
        // Criando objetos pessoa1 e pessoa2
        Pessoa pessoa1 = new Pessoa("Pedro", 21);
        Pessoa pessoa2 = new Pessoa("Mariana", 25);

        // Exibindo informações
        pessoa1.exibirInformacoes();
        pessoa2.exibirInformacoes();
    }
}

