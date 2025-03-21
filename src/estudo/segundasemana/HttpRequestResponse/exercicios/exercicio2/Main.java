package estudo.segundasemana.HttpRequestResponse.exercicios.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        int resposta;

        while (true) {
            try {
                numero1 = scanner.nextInt();
                numero2 = scanner.nextInt();

                resposta = numero1 / numero2;
            } catch (ArithmeticException e) {
                System.out.println("Erro: Impossível fazer divisão por 0.");
                continue;
            }
            System.out.println(resposta);
            break;
        }
    }
}
