package estudo.projetofinalAPI.modelos;

public record CepRecord(String cep, String logradouro, String bairro,
                        String localidade, String uf, String estado) {
}
