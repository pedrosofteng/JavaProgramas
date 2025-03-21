package estudo.segundasemana.arraylistcolecaodados.projetofinalorientacaoobjetos;

import estudo.segundasemana.arraylistcolecaodados.projetofinalorientacaoobjetos.modelos.Episodio;
import estudo.segundasemana.arraylistcolecaodados.projetofinalorientacaoobjetos.modelos.Musica;
import estudo.segundasemana.arraylistcolecaodados.projetofinalorientacaoobjetos.modelos.Podcast;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Podcast flowpodcast = new Podcast();
        Musica euNaoValhoNada = new Musica();
        Episodio numeroUm = new Episodio();
        Random random = new Random();
        flowpodcast.setNome("Flow Podcast");

        numeroUm.setNome("EP 01 - RENATO CARIANI E JÚLIO BALESTRIN");
        numeroUm.setDuracao(101);
        numeroUm.setPodcast(flowpodcast);
        for (int i = 1; i <= random.nextInt(20000); i++){
            numeroUm.curtir();
        }
        for (int i = 1; i <= random.nextInt(20000); i++){
            numeroUm.reproduzir();
        }
        for (int i = 1; i <= random.nextInt(1000); i++){
            numeroUm.classicacao(random.nextInt(10));
        }
        numeroUm.setParticipantes("Igor, Renato Cariani e Júlio Balestrin.");
        numeroUm.descricao();

        System.out.print(flowpodcast);
    }
}
