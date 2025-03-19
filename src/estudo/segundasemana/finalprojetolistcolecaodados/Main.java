package estudo.segundasemana.finalprojetolistcolecaodados;

import java.awt.event.ItemEvent;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Cartao cartao = new Cartao(random.nextDouble(5000) + 1000);
        List<Itens> lista = new ArrayList<>();
        String descricao;
        int numero = 0;
        double valor = 0;
        double limiteAtual;
        String mensagem = """
               \n[1] Comprar item.
               [2] Sair.\n""";

        while (numero != 2) {
            try {
                System.out.printf("%nLimite disponível: R$ %.2f%n", cartao.getLimite());
                System.out.println(mensagem);
                System.out.print("Escolha uma opção: ");
                numero = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Número inválido.");
                scanner.nextLine();
                continue;
            }
            switch (numero) {
                case 1:
                    try {
                        scanner.nextLine();
                        System.out.print("\nDescrição do item: ");
                        descricao = scanner.nextLine();
                        System.out.print("\nValor do item: R$ ");
                        valor = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Número/Caractére inválido.");
                        scanner.nextLine();
                        continue;
                    }
                    if (valor > cartao.getLimite()) {
                        numero = 2;
                    } else {
                        limiteAtual = cartao.getLimite();
                        limiteAtual -= valor;
                        cartao.setLimite(limiteAtual);

                        Itens item = new Itens(descricao, valor);
                        // Vou mudando os valores dentro do loop e acrescentando a lista
                        // Se eu deixar a criação do item lá em cima, ele vai atribuir
                        // A todos os itens da lista os últimos valores guardados em
                        // descricao e valor.
                        lista.add(item);
                    }
                    break;
            }

            lista.sort(Comparator.comparing(Itens::getPreco));
            System.out.println(lista);
        }
    }
}
