import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora básica +, -, / ou *");
        System.out.println("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        // consumir a quebra de linha remanescente do enter que o next.double não lê, só lê números
        scanner.nextLine();

        System.out.println("Digite o operador: ");
        String operador = scanner.nextLine();

        System.out.println("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        if (operador.equals("+")) {
            double resultado = n1 + n2;
            System.out.println("O resultado é: " + resultado);
        } else if (operador.equals("-")) {
            double resultado = n1 - n2;
            System.out.println("O resultado é: " + resultado);
        } else if (operador.equals("/")) {
            if (n2 == 0.0) {
                System.out.println("Impossível divisão por zero! Tente novamente.");
            } else if (n2 != 0.0) {
                double resultado = n1 / n2;
                System.out.println("O resultado é: " + resultado);
            }
        } else if (operador.equals("*")) {
            double resultado = n1 * n2;
            System.out.println("O resultado é: " + resultado);
        } else {
            System.out.println("Operador Inválido.");
        }
    }
}
