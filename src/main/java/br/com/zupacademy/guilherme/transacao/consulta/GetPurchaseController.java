package br.com.zupacademy.guilherme.transacao.consulta;



import br.com.zupacademy.guilherme.transacao.transaction.TransactionRepository;
import br.com.zupacademy.guilherme.transacao.transaction.Transaction;
import br.com.zupacademy.guilherme.transacao.transaction.TransactionForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cartoes")
public class GetPurchaseController {

    @Autowired
    TransactionRepository transactionRepository;

    @GetMapping("/{id}")
    public ResponseEntity<?> consultaCompra(@PathVariable("id") String id) {
        Integer page = 1;
        Integer size = 10;
        Pageable pageRequest = PageRequest.of(page, size, Sort.by("efetivadaEm").descending());

        Page<Transaction> transacao = transactionRepository.findAllByCartaoId(id, pageRequest);

        return transacao.isEmpty() ? 
                ResponseEntity.notFound().build() : ResponseEntity.ok().body(transacao.map(TransactionForm::new).getContent());
    }
}
