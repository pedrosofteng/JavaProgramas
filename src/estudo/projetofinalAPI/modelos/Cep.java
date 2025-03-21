package estudo.projetofinalAPI.modelos;

public class Cep {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;

    public Cep(CepRecord cepRecord) {
        this.cep = cepRecord.cep();
        this.bairro = cepRecord.bairro();
        this.logradouro = cepRecord.logradouro();
        this.uf = cepRecord.uf();
        this.estado = cepRecord.estado();
        this.localidade = cepRecord.localidade();
    }

    @Override
    public String toString() {
        return "\nCep: " + cep + "\n" +
                "Logradouro: " + logradouro + "\n" +
                "Bairro: " + bairro + "\n" +
                "Município: " + localidade + "\n" +
                "UF: " + uf + "\n" +
                "Estado: " + estado + "\n";
    }
}
