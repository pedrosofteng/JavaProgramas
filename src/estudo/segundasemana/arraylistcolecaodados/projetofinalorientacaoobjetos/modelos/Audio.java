package estudo.segundasemana.arraylistcolecaodados.projetofinalorientacaoobjetos.modelos;

public class Audio implements Classificavel {
    private String nome;
    private int duracao, reproducoes, curtidas, classificacao,
            quantidadeClassificacao, totalClasssificacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void descricao() {
        System.out.printf("%nNome: " + nome + "%n");
        System.out.printf("Duração: %d minutos%n", duracao);
        System.out.printf("%d Visualizações%n", reproducoes);
        System.out.printf("%d Curtidas%n", curtidas);
        System.out.println("Classificação (1 a 10) Nota: " + classificacao + "\n");
    }

    public void curtir() {
        curtidas++;
    }

    public void reproduzir() {
        reproducoes++;
    }

    @Override
    public void classicacao(int classificacao) {
        totalClasssificacao += classificacao;
        quantidadeClassificacao++;
        this.classificacao = totalClasssificacao/quantidadeClassificacao;
    }
}
