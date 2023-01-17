package liskov_substitution.good;

import java.math.BigDecimal;

public class CurrentAccount extends WithdrawableAccount {

    protected void deposit(BigDecimal amount) {
        //adds balance...
    }

    protected void withdraw(BigDecimal amount) {
        //withdraws balance...
    }
}
