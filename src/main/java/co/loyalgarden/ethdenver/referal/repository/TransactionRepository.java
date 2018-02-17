package co.loyalgarden.ethdenver.referal.repository;

import co.loyalgarden.ethdenver.referal.model.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Date: 17-Feb-18
 * Time: 16:44
 */
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    List<Transaction> findByRecipient(String recipient);

}
