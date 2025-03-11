import java.util.InputMismatchException;
import java.util.Scanner;

public class Comparação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;

        try {
        System.out.print("Digite o primeiro número: ");
        n1 = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Digite um número válido, sem casa decimais ou letras/palavras.");
            // limpa o buffer de entrada
            scanner.nextLine();
        }

        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextInt();
        
        if (n1 == n2) {
            System.out.printf("%d é igual a %d.", n1, n2);
        } else if (n1 > n2) {
            System.out.printf("%d é maior do que %d.", n1, n2);
        } else {
            System.out.printf("%d é maior do que %d", n2, n1);
        }
    }
}
