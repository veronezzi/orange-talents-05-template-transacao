package br.com.zupacademy.guilherme.transacao.transaction;


import br.com.zupacademy.guilherme.transacao.transaction.TransacacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransacaoComponent {

    @Autowired
    TransacacaoRepository transacaoRepository;


    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void escutaTopico(TransacaoRequest transacaoRequest) {
        Transacao transacao = transacaoRequest.toModel();
        transacaoRepository.save(transacao);
    }
}
