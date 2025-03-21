package estudo.segundasemana.arraylistcolecaodados.projetofinalorientacaoobjetos.modelos;

public class Podcast extends Audio implements Classificavel {
    private String participantes;

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    @Override
    public void descricao() {
        super.descricao();
        System.out.println("Participantes: " + participantes);
    }
}
