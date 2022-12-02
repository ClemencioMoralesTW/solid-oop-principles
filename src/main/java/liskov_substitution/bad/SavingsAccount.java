package liskov_substitution.bad;

import java.math.BigDecimal;

public class SavingsAccount extends Account {
    @Override    
    protected void deposit(BigDecimal amount) {
        // Deposit into SavingsAccount
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        // Withdraw from SavingsAccount
    }
}
