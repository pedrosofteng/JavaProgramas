package estudo.segundasemana.projetocarro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ModeloCarro carro1 = new ModeloCarro();
        carro1.setNomeDoModelo("Mustang");
        int numero = 0;
        String mensagem = """
                \n[1] Incluir preço a um carro.
                [2] Ver ficha técnica de um carro.
                [3] Ver a média de preço de um ano.
                [4] Ver o maior/menor preço em um ano.
                [5] Sair.
                """;

        while (numero != 5) {
            try {
                System.out.println(mensagem);
                System.out.println("Escolha uma opção:");
                numero = scanner.nextInt();

                switch (numero) {
                    case 1:
                        System.out.println("Qual o preço do carro?");
                        carro1.incluiPreco(scanner.nextDouble());
                        break;
                    case 2:
                        carro1.exibaFichaTecnica();
                        break;
                    case 3:
                        carro1.precoMedio();
                        break;
                    case 4:
                        carro1.maiorMenorPreco();
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Número Inválido.");
                scanner.nextLine();
                continue;
            }
        }
    }
}
