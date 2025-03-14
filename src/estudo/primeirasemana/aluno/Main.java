package estudo.primeirasemana.aluno;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno pedro = new Aluno();
        pedro.nome = "Pedro";
        int resposta = 0;
        String mensagem = """
                [1] Para lançar a nota.
                [2] Para ver a média.
                [3] Para sair.
                """;

        while (resposta != 3) {
            try {
                System.out.println(mensagem);
                System.out.print("Escolha um número: ");
                resposta = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Número Inválido.");
                System.out.println();
                scanner.nextLine();
                continue;
            }


            switch (resposta) {
                case 1:
                    System.out.print("Nota: ");
                    pedro.lerNotas(scanner.nextDouble());
                    System.out.printf("Nota = %.2f", pedro.notas);
                    System.out.println();
                    System.out.printf("Quantidade de notas: %d", pedro.quantidadeNotas);
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.print("A média é: ");
                    System.out.println(pedro.mediaNotas());
                    System.out.println();
                    break;
            }
        }

        scanner.close();
    }
}