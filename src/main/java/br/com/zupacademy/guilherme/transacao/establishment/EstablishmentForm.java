package br.com.zupacademy.guilherme.transacao.establishment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EstablishmentForm {

    @JsonProperty
    private String nome;

    @JsonProperty
    private String cidade;

    @JsonProperty
    private String endereco;

    @JsonCreator
    public EstablishmentForm(@JsonProperty("nome") String nome, @JsonProperty("cidade") String cidade, @JsonProperty("endereco") String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public Establishment toModel() {
        return new Establishment(nome, cidade, endereco);
    }

}
