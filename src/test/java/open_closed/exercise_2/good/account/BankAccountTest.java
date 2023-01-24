package open_closed.exercise_2.good.account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {

    @Test
    public void itShouldAllowDeposits() {
        BankAccount basicAccount = new BasicAccount(0.0);
        basicAccount.deposit(10.0);
        assertEquals(10.0, basicAccount.getBalance());
    }
}