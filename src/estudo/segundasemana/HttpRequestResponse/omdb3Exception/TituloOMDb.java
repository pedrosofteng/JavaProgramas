package estudo.segundasemana.HttpRequestResponse.omdb3Exception;

public record TituloOMDb(String title, String year, String runtime) {
    // record é usado como base para tradução de dados
    // não precisa mexer em nada, ela já tem os getters e setters
    // construtores padrões, toString e etc..
}
