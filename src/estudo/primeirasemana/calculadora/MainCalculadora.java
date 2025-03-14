package estudo.primeirasemana.calculadora;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while (true) {
            try {
                System.out.print("Informe um número: ");
                calculadora.dobro(scanner.nextDouble());

            } catch (InputMismatchException e) {
                System.out.println("Informe um número válido.");
                scanner.nextLine();
                continue;
            }
            break;
        }
    }
}