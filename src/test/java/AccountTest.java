import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @BeforeEach
    void setUp() {
        Customer c1 = new Customer("Jon");
        Account account = new Account(c1);
    }

    private List<Transaction> transactions;

    //Bare ignorer denneher.
    @Test
    void shouldShowSimpleAssertion() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    public int getBalance(){
        int sum = 0;
        for (Transaction transaction : transactions) {
            sum += transaction.getAmount();
        }
        return sum;
    }

    @Test
    public int withDrawAmount(int amount) throws InsufficientFundsException{
        if(amount <= getBalance()) {
            transactions.add(new Transaction(-amount, new Date()));
        } else {
            throw new InsufficientFundsException();
        }
        return getBalance();
    }

    @Test
    public int depositAmount(int amount) throws InvalidAmountException{
        if(amount > 0) {
            transactions.add(new Transaction(amount, new Date()));
        } else {
            throw new InvalidAmountException();
        }
        return getBalance();
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
}