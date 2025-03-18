package estudo.segundasemana.tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    private int resultado;

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.printf("%d x %d : %d%n", numero, i, resultado);
        }
    }
}
