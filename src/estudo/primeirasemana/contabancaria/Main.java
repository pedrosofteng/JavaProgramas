package estudo.primeirasemana.contabancaria;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        ContaSimples conta1 = new ContaSimples();
        ContaPlus conta2 = new ContaPlus();
        int numero = 0;

        System.out.print("Qual seu nome? ");
        conta2.setTitular(scanner.nextLine());
        conta2.setNumeroDaConta(randomNumber.nextInt(999));

        String mensagem = """
                [1] Para adicionar saldo.
                [2] Para transferir.
                [3] Consultar dados.
                [4] Sair.""";

        while (numero != 4) {
            System.out.println();
            System.out.println(mensagem);
            numero = scanner.nextInt();

            switch (numero) {
                case 1:
                    System.out.print("Quanto deseja adicionar? ");
                    conta2.adicioneSaldo(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Deseja transferir quanto? ");
                    conta2.transfira(scanner.nextDouble());
                    break;
                case 3:
                    conta2.exibeDados();
                    System.out.println(conta2.getMensagem());
                    break;
            }
        }
    }
}
