package estudo.primeirasemana.br.com.bancopen.calculadoras;

import estudo.primeirasemana.br.com.bancopen.contas.conta;

public class calculadorajuros {
    private double rendimentoTotal;

    public double getRendimentoTotal() {
        return rendimentoTotal;
    }

    // lá em Main eu declarei uma contapoupança como conta2
    public void render30 (conta c) {
        this.rendimentoTotal += c.getSaldo() * 0.045;
        // esse c. indica a conta2, conta2.getSaldo
        // ele é um parâmetro para pegar a informação da classe informada.
    }

    // public void render30 (contapoupança c) {
    //     this.rendimentoTotal += c.getSaldo() * 0.045;
    // }

    // posso me referenciar a classe mãe, conta ou a contapoupança
    // ambas o meu código vai rodar tranquilo no main PORÉM
    // se eu tiver um metodo render30 na contapoupança e outro diferente
    // na contacorrente, ele vai executar 1 tipo em uma, e 1 outra conta em outra
    // ele se adapta ao metodo mesmo sendo diferente nas subclasses com mesmo nome

    public void render30() {
    }
}
