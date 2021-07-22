package br.com.zupacademy.guilherme.transacao.transaction;

import br.com.zupacademy.guilherme.transacao.card.Cartao;
import br.com.zupacademy.guilherme.transacao.establishment.Estabelecimento;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Transacao {

    @Id
    private String id;

    @Column(nullable = false)
    private String idExterno;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    private LocalDateTime efetivadaEm;

    @Embedded
    private Cartao cartao;

    @Embedded
    private Estabelecimento estabelecimento;

    public Transacao(String id, BigDecimal valor, LocalDateTime efetivadaEm, Cartao cartao, Estabelecimento estabelecimento) {
        this.idExterno = id;
        this.valor = valor;
        this.efetivadaEm = efetivadaEm;
        this.cartao = cartao;
        this.estabelecimento = estabelecimento;
    }

    @Deprecated
    public Transacao() {
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

    public Cartao getCartao() {
        return this.cartao;
    }

    public Estabelecimento getEstabelecimento() {
        return this.estabelecimento;
    }

}
