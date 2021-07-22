package br.com.zupacademy.guilherme.transacao.card;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Card {

    @Column(nullable = false, name = "cartao_id")
    private String id;

    private String email;

    public Card(String id, String email) {
        this.id = id;
        this.email = email;
    }

    @Deprecated
    public Card() {

    }

    public String getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

}
