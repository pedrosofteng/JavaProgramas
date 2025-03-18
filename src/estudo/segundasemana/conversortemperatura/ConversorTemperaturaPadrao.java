package estudo.segundasemana.conversortemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    private int celsius;
    private int fahrenheit;

    @Override
    public void celsiusParaFahrenheit(int celsius) {
        fahrenheit = (celsius*9/5)+32;
        System.out.println(fahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(int fahrenheit) {
        celsius = (fahrenheit-32)*5/9;
        System.out.println(celsius);
    }
}
