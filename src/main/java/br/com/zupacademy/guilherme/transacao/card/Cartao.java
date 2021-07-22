package br.com.zupacademy.guilherme.transacao.card;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Cartao {

    @Column(nullable = false, name = "cartao_id")
    private String id;

    private String email;

    public Cartao(String id, String email) {
        this.id = id;
        this.email = email;
    }

    @Deprecated
    public Cartao() {

    }

    public String getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

}
