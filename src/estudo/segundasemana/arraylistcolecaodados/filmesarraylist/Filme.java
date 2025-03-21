package estudo.segundasemana.arraylistcolecaodados.filmesarraylist;

public class Filme extends Título {
    private int nota;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void exibirNome (Título titulo) {
        titulo.getNome();
    }
    // consigo exibir o nome de um atributo de outra classe, mesmo herdando
    // preciso seguir o padrão (Título (Classe) titulo (nome da classe nesse método))
    // chama a instância titulo que representa a Classe Titulo e peço nome
    // através do metodo getNome(), porque esse atributo é privado na classe
}
