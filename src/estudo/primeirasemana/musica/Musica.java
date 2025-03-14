package estudo.primeirasemana.musica;

public class Musica {
    private String titulo;
    private String artista;
    private int anoDeLancamento;
    private double avaliacao;
    private double numAvaliacoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public double getNumAvaliacoes() {
        return numAvaliacoes;
    }

    public int getAnoDeLancamento () {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento (int ano) {
        this.anoDeLancamento = ano;
    }

    // PODERIA FAZER ASSIM TAMBÉM

    /* public int setAnoDeLancamento (int ano) {
        return anoDeLancamento = ano
    }*/

    public void exibaFichaTecnica () {
        System.out.println("Nome do artista: " + this.artista);
        System.out.println("Nome da música: " + this.titulo);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
        System.out.println("Avaliação: " + this.avaliacao);
        System.out.println("Número de avaliações: " + this.numAvaliacoes);
    }

    public void avalia (double nota) {
        if (nota >= 0) {
            avaliacao += nota;
            numAvaliacoes++;
        } else {
            System.out.println("Digite números positivos.");
        }
    }

    public double mediaAvaliacoes () {
            return avaliacao / numAvaliacoes;
    }
}
