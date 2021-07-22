package br.com.zupacademy.guilherme.transacao.transaction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionComponent {

    @Autowired
    TransactionRepository transacaoRepository;


    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void escutaTopico(TransactionDTO transactionDTO) {
        Transaction transaction = transactionDTO.toModel();
        transacaoRepository.save(transaction);
    }
}
