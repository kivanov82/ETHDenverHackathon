package co.loyalgarden.ethdenver.referal.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Date: 17-Feb-18
 * Time: 16:41
 */
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    String message;

    BigDecimal ammount;

    //Hibernate
    protected Transaction() {

    }

    public Transaction(String message, BigDecimal ammount) {
        this.message = message;
        this.ammount = ammount;
    }

    public String getMessage() {
        return message;
    }

    public BigDecimal getAmmount() {
        return ammount;
    }
}
