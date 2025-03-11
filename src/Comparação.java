import java.util.InputMismatchException;
import java.util.Scanner;

public class Comparação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = 0.0;
        double n2 = 0.0;

        try {
        System.out.print("Digite o primeiro número: ");
        n1 = (int) Math.round(scanner.nextDouble());;

        } catch (InputMismatchException e) {
            System.out.println("Digite um número válido, sem letras/palavras.");
            // limpa o buffer de entrada
            scanner.nextLine();
            // se não está dentro de um loop não precisa de um "continue"
        }

        try {
        System.out.print("Digite o segundo número: ");
        n2 = (int) Math.round(scanner.nextDouble());

        } catch (InputMismatchException e) {
            System.out.println("Digite um número válido, sem letras/palavras.");
            scanner.nextLine();
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
