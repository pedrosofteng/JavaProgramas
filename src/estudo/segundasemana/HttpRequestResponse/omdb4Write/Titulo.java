package estudo.segundasemana.HttpRequestResponse.omdb4Write;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;

    public Titulo(TituloOMDb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4)
            throw new ErroConversaoAnoException("Não consegui converter o ano" +
                    " porque tem mais de 4 caracteres");

        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year().substring(0,4));
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,3));
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Ano: " + anoDeLancamento + "\n" +
                "Duração: " + duracaoEmMinutos + "\n";
    }
}
