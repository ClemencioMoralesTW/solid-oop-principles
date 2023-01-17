package liskov_substitution.good;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account {

    protected void deposit(BigDecimal amount) {
        //adds balance...
    }
}
