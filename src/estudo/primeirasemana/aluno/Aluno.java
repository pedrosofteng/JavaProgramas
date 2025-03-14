package estudo.primeirasemana.aluno;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aluno {
    Scanner scanner = new Scanner(System.in);
    String nome;
    String resposta;
    int idade;
    int quantidadeNotas;
    double notas;

    void lerNotas(double nota) {
        if (nota >= 0) {
            System.out.print("Deseja adicionar essa nota a este aluno?");
            System.out.print(" Sim ou Não? ");
            resposta = scanner.nextLine();

            while (true) {
                try {
                    if (resposta.equals("Sim") || resposta.equals("sim") ||
                            resposta.equals("s") || resposta.equals("S") ||
                            resposta.equals(" Sim") || resposta.equals(" sim") ||
                            resposta.equals(" s") || resposta.equals(" S")) {
                        this.notas += nota;
                        this.quantidadeNotas++;
                        break;
                    } else if (resposta.equals("Não") || resposta.equals("Nao")
                            || resposta.equals("não") || resposta.equals("nao")
                            || resposta.equals("n") || resposta.equals("N")) {
                        System.out.println("Nota não adicionada.");
                        break;
                    } else {
                        System.out.println();
                        System.out.println("Inválido, digite novamente.");
                        resposta = scanner.nextLine();
                        System.out.println();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Caractere inválido, digite novamente.");
                    scanner.nextLine();
                    continue;
                }
            }

        } else {
            System.out.println();
            System.out.println("Digite uma nota positiva.");
            System.out.println();
        }
    }

    double mediaNotas() {
        if (quantidadeNotas == 0) {
            return 0;
        } else
            return notas / quantidadeNotas;
    }

}
