package br.com.zupacademy.guilherme.transacao.card;


public class CardForm {

    private String id;
    private String email;

    public CardForm(String id, String email) {
        this.id = id;
        this.email = email;
    }

    @Deprecated
    public CardForm() {
    }

    public Card toModel() {
        return new Card(id, email);
    }

    public String getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }   

}
