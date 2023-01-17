package liskov_substitution.good;

import java.math.BigDecimal;

public abstract class WithdrawableAccount extends Account {

    protected abstract void withdraw(BigDecimal amount);
}
