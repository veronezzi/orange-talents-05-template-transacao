package br.com.zupacademy.guilherme.transacao.card;


public class CartaoRequest {

    private String id;
    private String email;

    public CartaoRequest(String id, String email) {
        this.id = id;
        this.email = email;
    }

    @Deprecated
    public CartaoRequest() {
    }

    public Cartao toModel() {
        return new Cartao(id, email);
    }

    public String getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }   

}
