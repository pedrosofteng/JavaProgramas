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
        int convertido = 0;
        int numero = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        while (contador <= 3) {
            try {
                System.out.println("Número de tantivas: " + contador);
                System.out.println("Tente advinhar o número ou escreva -1 para sair: ");
                // não coloquei int porque já declarei essas variáveis antes
                numero = scanner.nextInt();
                // converti o número caso coloque número decimal
                // 9.2 vira 9, 9.8 vira 10
                convertido = (int) Math.round(numero);

            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número válido.");
                // limpa o buffer de entrada
                scanner.nextLine();
                // continue -> volta ao início do try
                continue;
            }

            // a cada tentativa eu uso o contador pra salvar os números
            if (contador == 1) {
                n1 = convertido;
            } else if (contador == 2) {
                n2 = convertido;
            } else {
                n3 = convertido;
            }

            if (numero == -1) {
                break;
            } else if (convertido == random) {
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
