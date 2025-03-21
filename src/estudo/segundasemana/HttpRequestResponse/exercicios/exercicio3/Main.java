package estudo.segundasemana.HttpRequestResponse.exercicios.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        try {
            System.out.print("\nEscreva sua senha em 8 caracteres: ");
            usuario.setSenha(scanner.nextLine());
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Finalizando programa.");
    }
}
