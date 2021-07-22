package br.com.zupacademy.guilherme.transacao.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class TransactionForm {
 
    private String id;
	private BigDecimal valor;
	private LocalDateTime efetivadaEm;
	private String email;
	private String nome;
	private String cidade;
	private String endereco;
    
    public TransactionForm(Transaction transaction) {
        this.id = transaction.getId();
        this.valor = transaction.getValor();
        this.efetivadaEm = transaction.getEfetivadaEm();
        this.email = transaction.getCartao().getEmail();
        this.nome = transaction.getEstabelecimento().getNome();
        this.cidade = transaction.getEstabelecimento().getCidade();
        this.endereco = transaction.getEstabelecimento().getEndereco();
    }

    public String getId() {
        return this.id;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return this.efetivadaEm;
    }

    public String getEmail() {
        return this.email;
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

    
