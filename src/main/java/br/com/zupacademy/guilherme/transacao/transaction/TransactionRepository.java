package br.com.zupacademy.guilherme.transacao.transaction;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
    Page<Transaction> findAllByCartaoId(String id, Pageable pageable);
}
