package estudo.primeirasemana.simplesprogamas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = 0;
        double n2 = 0;
        int contador = 1;

        while (contador <= 2) {
            try {
                if (contador == 1) {
                    System.out.print("Digite o primeiro número: ");
                    n1 = (int) Math.round(scanner.nextDouble());
                } else if (contador == 2) {
                    System.out.print("Digite o segundo número: ");
                    n2 = (int) Math.round(scanner.nextDouble());
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido, sem letras/palavras.");
                scanner.nextLine();
            }

            contador++;
        }

        if (n1 == n2) {
            System.out.printf("%.0f é igual a %.0f.", n1, n2);
        } else if (n1 > n2) {
            System.out.printf("%.0f é maior do que %.0f.", n1, n2);
        } else {
            System.out.printf("%.0f é maior do que %.0f", n2, n1);
        }
    }
}