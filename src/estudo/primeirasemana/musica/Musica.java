package estudo.primeirasemana.musica;

public class Musica {
    String titulo;
    String artista;
    private int anoDeLançamento;
    double avaliacao;
    double numAvaliacoes;

    int getAnoDeLançamento () {
        return anoDeLançamento;
    }

    int setAnoDeLançamento (int ano) {
        return anoDeLançamento = ano;
    }

    void exibaFichaTecnica () {
        System.out.println("Nome do artista: " + this.artista);
        System.out.println("Nome da música: " + this.titulo);
        System.out.println("Ano de lançamento: " + this.anoDeLançamento);
        System.out.println("Avaliação: " + this.avaliacao);
        System.out.println("Número de avaliações: " + this.numAvaliacoes);
    }

    void avalia (double nota) {
        if (nota >= 0) {
            avaliacao += nota;
            numAvaliacoes++;
        } else {
            System.out.println("Digite números positivos.");
        }
    }

    double mediaAvaliacoes () {
            return avaliacao / numAvaliacoes;
    }
}
