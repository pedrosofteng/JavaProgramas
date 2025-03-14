package estudo.primeirasemana.calculadora;
public class Calculadora {
    double resultado;
    double ultimoNumero;
    String mensagem;

    void dobro(double numero) {
        this.resultado = numero * 2;
        this.ultimoNumero = numero;

        mensagem = String.format("O dobro de %.2f é: %.2f", this.ultimoNumero, this.resultado);
        System.out.println(mensagem);
    }
}
