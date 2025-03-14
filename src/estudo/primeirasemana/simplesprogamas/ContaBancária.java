package estudo.primeirasemana.simplesprogamas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaBancária {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        String nome = "Pedro Miranda";
        String tipoDeConta = "Conta Corrente";
        double saldoInicial = 3450.00;
        double receber = 0;
        double transferir = 0;

        System.out.println();
        System.out.println("Dono da Conta: " + nome);
        System.out.println("Saldo Inicial: R$ " + saldoInicial);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println();

        while (true) {
            System.out.println("OPERAÇÕES");
            System.out.println();
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            while (true) {
                try {
                    System.out.println();
                    System.out.print("Escolha uma opção: ");
                    numero = scanner.nextInt();
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite um número válido.");
                    scanner.nextLine();

                    continue;
                }
            }

            if (numero == 4) {
                System.out.println();
                System.out.println("Saindo da conta...");
                break;
            }

            switch (numero) {
                case 1:
                    System.out.println();
                    System.out.print("Saldo atualizado:");
                    System.out.printf(" R$ %.2f", saldoInicial);
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Quanto deseja receber? R$ ");
                    receber = scanner.nextDouble();
                    System.out.println();

                    if (receber <= 0) {
                        System.out.println("Impossível receber essa quantia.");
                        System.out.println();
                        break;
                    } else {
                        saldoInicial += receber;
                        // saldo inicial = receber + saldo inicial
                        System.out.println("Saldo atualizado!");
                        System.out.println();
                        break;
                    }
                case 3:
                    System.out.println();
                    System.out.print("Quanto deseja transfeir? R$ ");
                    transferir = scanner.nextDouble();
                    System.out.println();

                    if (transferir > saldoInicial) {
                        System.out.println("Não consigo fazer essa operação.");
                        System.out.println();
                        break;
                    } else {
                        saldoInicial -= transferir;
                        System.out.println("Saldo atualizado!");
                        System.out.println();
                        break;
                    }
            }
        }

        scanner.close();
    }
}
