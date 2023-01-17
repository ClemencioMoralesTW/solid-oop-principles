package liskov_substitution.good;

import java.math.BigDecimal;

public abstract class Account {

    protected abstract void deposit(BigDecimal amount);
}
