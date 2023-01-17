package liskov_substitution.good;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class AccountTest {

    private CurrentAccount currentAccount;
    private FixedTermDepositAccount fixedTermDepositAccount;
    private SavingsAccount savingsAccount;

    @BeforeEach
    public void setUp() {
        this.currentAccount = new CurrentAccount();
        this.fixedTermDepositAccount = new FixedTermDepositAccount();
        this.savingsAccount = new SavingsAccount();
    }

    @Test
    public void itShouldAllowDepositAndWithdrawInCurrentAccount() {
        this.currentAccount.deposit(BigDecimal.TEN);
        this.currentAccount.withdraw(BigDecimal.ONE);
    }

    @Test
    public void itShouldOnlyAllowDepositInFixedTermDepositAccount() {
        this.fixedTermDepositAccount.deposit(BigDecimal.TEN);
    }

    @Test
    public void itShouldAllowDepositAndWithdrawInSavingsAccount() {
        this.savingsAccount.deposit(BigDecimal.TEN);
        this.savingsAccount.withdraw(BigDecimal.ONE);
    }
}