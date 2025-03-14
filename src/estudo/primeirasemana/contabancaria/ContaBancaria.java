package estudo.primeirasemana.contabancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaBancaria {
    Scanner scanner = new Scanner(System.in);
    private int numeroDaConta;
    private double saldo;
    private String titular;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setTitular(String titular) {
        while (true) {
            try {
                this.titular = titular;
            } catch (InputMismatchException e) {
                System.out.println("Use caracteres.");
                scanner.nextLine();
                continue;
            }
            break;
        }
    }

    public void transfira (double valor) {
        while (true) {
            try {
                if (valor <= saldo) {
                    saldo -= valor;
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Número invalido.");
                scanner.nextLine();
                continue;
            }
            break;
        }
    }

    public void adicioneSaldo (double valor) {
        while (true) {
            try {
                if (valor >= 0) {
                    saldo += valor;
                } else {
                    System.out.println("Digite um número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Número inválido.");
                scanner.nextLine();
                continue;
            }
            break;
        }
    }

    public void exibeDados () {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número: " + this.numeroDaConta);
        System.out.printf("Saldo: R$ %.2f", this.saldo);
        System.out.println();
    }
}
