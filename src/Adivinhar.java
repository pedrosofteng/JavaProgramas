import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Adivinhar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // new Random -> cria um novo objeto de classe Random, gera número aleatórios
        // .nextInt(100) -> gera um número entre 0(inclusivo) e 100(exclusivo)
        // ou seja gera um número de 0 a 99
        // int random -> cria uma variável random que vai armazenar o número
        int random = new Random().nextInt(100);
        int contador = 1;
        double numero = 0.0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        while (contador <= 3) {
            try {
                System.out.println("Tentativa número: " + contador);
                System.out.println("Tente advinhar o número ou escreva -1 para sair: ");
                // Math.round -> converti o número caso coloque número decimal
                // 9.2 vira 9, 9.8 vira 10
                // coloquei o scanner dentro do math.round, lê normalmente
                numero = (int) Math.round(scanner.nextDouble());


            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número válido.");
                // limpa o buffer de entrada
                scanner.nextLine();
                // continue -> volta ao início do try
                continue;
            }

            // a cada tentativa eu uso o contador pra salvar os números
            if (contador == 1) {
                n1 = (int) numero;
            } else if (contador == 2) {
                n2 = (int) numero;
            } else {
                n3 = (int) numero;
            }

            if (numero == -1) {
                break;
            } else if (numero == random) {
                System.out.println("Parabéns você acertou, o número é: " + random);
                break;
            } else {
                System.out.println("Você errou, tente novamente");
            }

            // aumentar o contador + 1
            contador++;
        }

        System.out.println("Seu primeiro número foi: " + n1);
        System.out.println("Seu segundo número foi: " + n2);
        System.out.println("Seu terceiro número foi: " + n3);
        System.out.println("O número gerado foi: " + random);

        scanner.close();
    }
}
