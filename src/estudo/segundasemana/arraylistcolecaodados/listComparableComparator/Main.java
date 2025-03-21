package estudo.segundasemana.arraylistcolecaodados.listComparableComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Banco inter = new Banco("Inter");
        ContaBancaria conta1 = new ContaBancaria("Pedro", 20.0,
                random.nextInt(900) + 100, inter);
        ContaBancaria conta2 = new ContaBancaria("José", 100.0,
                random.nextInt(900) + 100, inter);
        ContaBancaria conta3 = new ContaBancaria("Fernando", 55.5,
                random.nextInt(900) + 100, inter);
        ContaCorrente conta4 = new ContaCorrente("Paulo", 55.4,
                random.nextInt(900) + 100, inter, "7% ao ano");
        List<ContaBancaria> contas = new ArrayList<>();
        // List<ContaBancaria> contas = new LinkedList<>();
        // List = Interface de contrato para todas as listas
        // Não posso dar new List pois é uma interface e não possui métodos.

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);

        contas.sort(Comparator.comparing(ContaBancaria::getAgencia));
        // contas.sort(Comparator.comparing(ContaBancaria::getAgencia).reversed());
        // Para fazer a lista em ordenamento ao contrário.
        for (ContaBancaria conta: contas) {
            System.out.println(conta);
        }

        Collections.sort(contas);
        for (ContaBancaria conta: contas) {
            System.out.println(conta);
        }
    }
}
