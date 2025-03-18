package estudo.primeirasemana.br.com.bancopen;

import estudo.primeirasemana.br.com.bancopen.calculadoras.calculadorajuros;
import estudo.primeirasemana.br.com.bancopen.contas.contacorrente;
import estudo.primeirasemana.br.com.bancopen.contas.contapoupança;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        contacorrente conta1 = new contacorrente();
        contapoupança conta2 = new contapoupança();
        calculadorajuros calculadora = new calculadorajuros();
        conta1.setTitular("Pedro");
        conta2.setTitular("Layanne");
        int numero = 0;
        String mensagem1 = """
                    [1] Para adicionar saldo.
                    [2] Para transferir.
                    [3] Consultar dados.
                    [4] Sair.""";

        String mensagem2 = """
                    [1] Para adicionar saldo.
                    [2] Para transferir.
                    [3] Consultar dados.
                    [4] Ver rendimento em 30 dias.
                    [5] Sair.""";

        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        if (nome.equals("Pedro")) {
            conta1.setNumeroDaConta(randomNumber.nextInt(999));

            while (numero != 4) {
                System.out.println();
                System.out.println(mensagem1);
                numero = scanner.nextInt();

                switch (numero) {
                    case 1:
                        System.out.print("Quanto deseja adicionar? ");
                        conta1.adicioneSaldo(scanner.nextDouble());
                        break;
                    case 2:
                        System.out.print("Deseja transferir quanto? ");
                        conta1.transfira(scanner.nextDouble());
                        break;
                    case 3:
                        conta1.exibeDados();
                        break;
                }
            }

        } else if (nome.equals("Layanne")) {
            conta2.setNumeroDaConta(randomNumber.nextInt(999));

            while (numero != 5) {
                System.out.println();
                System.out.println(mensagem2);
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
                    case 4:
                        // preciso colocar qual conta ele vai render
                        // criei as contas, e eu coloco o nome da conta que criei
                        // pra ele fazer o cálculo do metodo, ele vai puxar
                        // getsaldo da conta2
                        calculadora.render30(conta2);
                        System.out.println(calculadora.getRendimentoTotal());
                        break;
                }
            }
        }
    }
}
