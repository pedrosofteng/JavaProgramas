package estudo.primeirasemana.musica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Musica musica1 = new Musica();
        musica1.avalia(8);

        System.out.print("Nome do artista: ");
        musica1.setArtista(scanner.nextLine());

        System.out.print("Título da música: ");
        musica1.setTitulo(scanner.nextLine());

        System.out.print("Ano de lançamento: ");
        musica1.setAnoDeLancamento(scanner.nextInt());
        System.out.println(musica1.getAnoDeLancamento());

        System.out.print("Dê uma nota a música: ");
        musica1.avalia(scanner.nextDouble());

        System.out.print("A média é ");
        System.out.println(musica1.mediaAvaliacoes());

        System.out.println();
        musica1.exibaFichaTecnica();
    }
}
