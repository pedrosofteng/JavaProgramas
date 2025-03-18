package estudo.segundasemana.projetofinalorientacaoobjetos.modelos;

public class Musica extends Audio{
    private String autor;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void descricao() {
        super.descricao();
        System.out.println("Artista: " + autor);
    }
}
