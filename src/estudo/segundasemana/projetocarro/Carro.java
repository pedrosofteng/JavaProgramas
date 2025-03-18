package estudo.segundasemana.projetocarro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Carro {
    Scanner scanner = new Scanner(System.in);
    private String nomeDoModelo;
    private double preco2022;
    private double preco2023;
    private double preco2024;
    // Double.MAX_VALUE = começar com maior valor possível
    // Integer.MAX_VALUE = se for int
    private double menor2022 = Double.MAX_VALUE;
    private double menor2023 = Double.MAX_VALUE;
    private double menor2024 = Double.MAX_VALUE;
    private double maior2022;
    private double maior2023;
    private double maior2024;
    private int quantidadePreco2022 = 0;
    private int quantidadePreco2023 = 0;
    private int quantidadePreco2024 = 0;
    private int ano = 0;
    private double ultimoPreco2022;
    private double ultimoPreco2023;
    private double ultimoPreco2024;

    public String getNomeDoModelo() {
        return nomeDoModelo;
    }

    public void setNomeDoModelo(String nomeDoModelo) {
        this.nomeDoModelo = nomeDoModelo;
    }

    public void incluiPreco (double preco) {
        while (quantidadePreco2022 != 1 || quantidadePreco2023 != 1 ||
                quantidadePreco2024 != 1) {
            try {
                System.out.println("Em qual ano você vai incluir o preço?");
                System.out.println("2022 / 2023 / 2024");
                ano = scanner.nextInt();
                if (ano == 2022) {
                    this.ultimoPreco2022 = preco;
                    this.preco2022 += preco;
                    quantidadePreco2022++;
                    if (menor2022 > preco) {
                        menor2022 = preco;
                    }
                    if (maior2022 < preco) {
                        maior2022 = preco;
                    }
                    break;
                } else if (ano == 2023) {
                    this.ultimoPreco2023 = preco;
                    this.preco2023 += preco;
                    quantidadePreco2023++;
                    if (menor2023 > preco) {
                        menor2023 = preco;
                    }
                    if (maior2023 < preco) {
                        maior2023 = preco;
                    }
                    break;
                } else if (ano == 2024) {
                    this.ultimoPreco2024 = preco;
                    this.preco2024 += preco;
                    quantidadePreco2024++;
                    if (menor2024 > preco) {
                        menor2024 = preco;
                    }
                    if (maior2024 < preco) {
                        maior2024 = preco;
                    }
                    break;
                } else {
                    System.out.println("\nAno inválido. \n");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nNúmero Inválido. \n");
                scanner.nextLine();
                continue;
            }
        }
    }

    public void precoMedio () {
        while (true) {
            try {
                System.out.println("\nQual ano deseja ver o preço médio?");
                ano = scanner.nextInt();
                if (ano == 2022) {
                    System.out.printf("%nO preço médio desse ano foi: R$ %.2f%n",
                            preco2022 / quantidadePreco2022);
                } else if (ano == 2023) {
                    System.out.printf("%nO preço médio desse ano foi: R$ %.2f%n",
                            preco2023 / quantidadePreco2023);
                } else if (ano == 2024) {
                    System.out.printf("%nO preço médio desse ano foi: R$ %.2f%n",
                            preco2024 / quantidadePreco2024);
                } else {
                    System.out.printf("Ano sem informações de preço.");
                }
            } catch (InputMismatchException e) {
                System.out.printf("Número Inválido.");
                scanner.nextLine();
                continue;
            }
            break;
        }
    }


    public void exibaFichaTecnica () {
        while (true) {
            try {
                System.out.println("Qual ano?");
                ano = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Informe um número válido.");
                scanner.nextLine();
                continue;
            }
            break;
        }
        if (ano == 2022 && preco2022 > 0) {
            System.out.println("\nNome do carro: " + this.nomeDoModelo);
            System.out.printf("Último preço de 2022: R$ %.2f%n", ultimoPreco2022);
        } else if (ano == 2023 && preco2023 > 0) {
            System.out.println("Nome do carro: " + this.nomeDoModelo);
            System.out.printf("Último preço de 2023: R$ %.2f%n", ultimoPreco2023);
        } else if (ano == 2024 && preco2024 > 0) {
            System.out.println("Nome do carro: " + this.nomeDoModelo);
            System.out.printf("Último preço de 2024: R$ %.2f%n", ultimoPreco2024);
        } else {
            System.out.println("\nPreço não informado, informe um preço para esse ano. \n");
        }
    }

    public void maiorMenorPreco () {
        while (true) {
            try {
                System.out.println("\nQual o ano?");
                ano = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido.");
                scanner.nextLine();
                continue;
            }
            break;
        }
        if (ano == 2022) {
            System.out.printf("%nMaior preço: R$ %.2f", maior2022);
            if (preco2022 == 0) {
                System.out.println("\nMenor preço: R$ 0.00");
            } else
                System.out.printf("%nMenor preço: R$ %.2f%n", menor2022);
        } else if (ano == 2023) {
            System.out.printf("%nMaior preço: R$ %.2f", maior2023);
            if (preco2023 == 0) {
                System.out.println("\nMenor preço: R$ 0.00");
            } else {
                System.out.printf("%nMenor preço: R$ %.2f%n", menor2023);
            }
        } else if (ano == 2024) {
            System.out.printf("%nMaior preço: R$ %.2f", maior2024);
            if (preco2024 == 0) {
                System.out.println("\nMenor preço: R$ 0.00");
            } else {
                System.out.printf("%nMenor preço: R$ %.2f%n", menor2024);
            }
        } else {
            System.out.println("Sem registro deste ano.");
        }
    }
}
