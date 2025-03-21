package estudo.segundasemana.arraylistcolecaodados.projetofinalorientacaoobjetos.modelos;

public class Episodio extends Podcast {
    private Podcast podcast;
    private int numero;
    private String nome;

    public Podcast getPodcast() {
        return podcast;
    }

    public void setPodcast(Podcast podcast) {
        this.podcast = podcast;
    }

    @Override
    public void descricao() {
        super.descricao();
        System.out.println("Podcast: " + podcast.getNome());
    }
}
