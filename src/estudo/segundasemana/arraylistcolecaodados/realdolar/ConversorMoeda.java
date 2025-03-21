package estudo.segundasemana.arraylistcolecaodados.realdolar;

public class ConversorMoeda implements ConversaoFinanceira {
    private double real;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    @Override
    public void converterDolarParaReal(double dolar) {
        real = dolar/5.70;
        System.out.printf("%.2f", real);
    }
}
