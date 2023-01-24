package open_closed.exercise_2.good.account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicAccountTest {

    private BankAccount basicAccount = new BasicAccount(100.0);

    @Test
    public void itShouldAllowWithdrawalsAndApplyFee() {
        basicAccount.withdraw(10.0);
        assertEquals(89.9, basicAccount.getBalance());
    }

    @Test
    public void itShouldAllowTransfersAndApplyFee() {
        final BankAccount toAccount = new BasicAccount(0.0);
        basicAccount.transfer(50.0, toAccount);
        assertEquals(48.5, basicAccount.getBalance());
        assertEquals(50.0, toAccount.getBalance());
    }

    @Test
    public void itShouldHaveNoIncreasingInterest() {
        basicAccount.applyInterest(12);
        assertEquals(100.0, basicAccount.getBalance());
    }
}