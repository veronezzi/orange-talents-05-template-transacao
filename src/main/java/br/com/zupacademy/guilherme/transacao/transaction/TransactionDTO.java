package br.com.zupacademy.guilherme.transacao.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.zupacademy.guilherme.transacao.card.CardForm;
import br.com.zupacademy.guilherme.transacao.establishment.EstablishmentForm;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionDTO {

    @JsonProperty
    private String id;

    @JsonProperty
    private BigDecimal valor;

    @JsonProperty
    private LocalDateTime efetivadaEm;

    @JsonProperty
    private CardForm cartao;

    @JsonProperty
    private EstablishmentForm estabelecimento;

    /**
     * @param id
     * @param valor
     * @param efetivadaEm
     * @param cartao para funcionar corretamente o Objeto preciso ter o nome do objeto que recebe por exemplo Cartao cartao
     * @param estabelecimento mesma coisa
     */
    
    @JsonCreator
    public TransactionDTO(@JsonProperty("id") String id, @JsonProperty("valor") BigDecimal valor,
                          @JsonProperty("efetivadaEm") LocalDateTime efetivadaEm, @JsonProperty("cartao") CardForm cartao,
                          @JsonProperty("estabelecimento") EstablishmentForm estabelecimento) {
        this.id = id;
        this.valor = valor;
        this.efetivadaEm = efetivadaEm;
        this.cartao = cartao;
        this.estabelecimento = estabelecimento;
    }

    public Transaction toModel() {
        return new Transaction(id, valor, efetivadaEm, getCartao().toModel(), getEstabelecimento().toModel());
    }

    public String getId() {
        return this.id;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public CardForm getCartao() {
        return this.cartao;
    }

    public EstablishmentForm getEstabelecimento() {
        return this.estabelecimento;
    }

}
