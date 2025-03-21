package estudo.segundasemana.arraylistcolecaodados.calculadoraretangular;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    @Override
    public void calcularArea(double base, double altura) {
        resultado = base * altura;
        System.out.println(resultado);
    }

    @Override
    public void calcularPerimetro(double base, double altura) {
        resultado = 2*(base+altura);
        System.out.println(resultado);
    }
}
