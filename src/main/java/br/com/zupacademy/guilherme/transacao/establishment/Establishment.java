package br.com.zupacademy.guilherme.transacao.establishment;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Establishment {

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String endereco;

    public Establishment(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    @Deprecated
    public Establishment() {
    }


    public String getNome() {
        return this.nome;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getEndereco() {
        return this.endereco;
    }

}
