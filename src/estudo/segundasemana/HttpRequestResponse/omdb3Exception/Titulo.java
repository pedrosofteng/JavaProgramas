package estudo.segundasemana.HttpRequestResponse.omdb3Exception;

public class Titulo {
    //@SerializedName("Title")
    private String nome;
    // como no json dos arquivos o nome vem com TITLE
    // eu falei que nome também representa title com @SerializedName
    //@SerializedName("Year")
    private int anoDeLancamento;
    private int duracaoEmMinutos;

    public Titulo(TituloOMDb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        // no if eu uso o parâmetro do recorde OMDb, não o do anoDeLancamento
        // length = tamanho do texto
        if (meuTituloOmdb.year().length() > 4)
            throw new ErroConversaoAnoException("Não consegui converter o ano" +
                    " porque tem mais de 4 caracteres");
        // crie uma nova exception
        // vai se criar uma nova classe "ErroConversaoAnoException"
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year().substring(0,4));
        // Integer.parseInt = faz a conversão de String para Int (tipo primitivo)
        // .valueOf = faz a conversão para a classe Integer
        /* Use parseInt() se você precisa de um valor primitivo (int).
        Use valueOf() se você precisa de um objeto (Integer), por exemplo,
        quando trabalhar com coleções ou APIs que exigem objetos.*/
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
        // substring = um comando que pega desde por exemplo o caractere 0 ao 2
        // string: "2839" com substring 0,2: 28
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Ano: " + anoDeLancamento + "\n" +
                "Duração: " + duracaoEmMinutos;
    }
    // mudo o toString para agora chamar lá na main
    // System.out.print(meuTitulo);
}
