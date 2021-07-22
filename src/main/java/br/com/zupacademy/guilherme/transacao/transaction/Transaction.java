package br.com.zupacademy.guilherme.transacao.transaction;

import br.com.zupacademy.guilherme.transacao.card.Card;
import br.com.zupacademy.guilherme.transacao.establishment.Establishment;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Transaction {

    @Id
    private String id;

    @Column(nullable = false)
    private String idExterno;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    private LocalDateTime efetivadaEm;

    @Embedded
    private Card card;

    @Embedded
    private Establishment establishment;

    public Transaction(String id, BigDecimal valor, LocalDateTime efetivadaEm, Card card, Establishment establishment) {
        this.idExterno = id;
        this.valor = valor;
        this.efetivadaEm = efetivadaEm;
        this.card = card;
        this.establishment = establishment;
    }

    @Deprecated
    public Transaction() {
    }

    @PrePersist
    public void prePersist() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }

    public String getIdExterno() {
        return this.idExterno;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return this.efetivadaEm;
    }

    public Card getCartao() {
        return this.card;
    }

    public Establishment getEstabelecimento() {
        return this.establishment;
    }

}
