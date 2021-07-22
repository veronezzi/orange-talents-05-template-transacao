package br.com.zupacademy.guilherme.transacao.transaction;


import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacacaoRepository extends JpaRepository<Transacao, String> {}
