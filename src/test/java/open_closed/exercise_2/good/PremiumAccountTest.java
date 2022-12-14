package open_closed.exercise_2.good;

import open_closed.exercise_2.good.account.CheckingAccount;
import open_closed.exercise_2.good.account.PremiumAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PremiumAccountTest {

    @Test
    void shouldHaveNoWithdrawFee() {
        int initialBalance = 100;
        var premiumAccount = new PremiumAccount(initialBalance);

        int amountToWithdraw = 10;
        var result = premiumAccount.withdraw(amountToWithdraw);

        assertEquals(initialBalance - amountToWithdraw, result);
    }

    @Test
    void shouldHaveNoTransferFee() {
        int initialBalance = 100;
        var premiumAccount = new PremiumAccount(initialBalance);
        var anotherAccount = new CheckingAccount(0);

        int amountToTransfer = 10;
        var result = premiumAccount.transfer(amountToTransfer, anotherAccount);

        assertEquals(initialBalance - amountToTransfer, result);
        assertEquals(amountToTransfer, anotherAccount.getBalance());
    }

    @Test
    void shouldCorrectlyCalculateInterestAfterAMonth() {
        int initialBalance = 100;
        var premiumAccount = new PremiumAccount(initialBalance);

        var result = premiumAccount.applyInterest(1);

        var expected = initialBalance * (1.02);
        assertEquals(expected, result);
    }

    @Test
    void shouldCorrectlyCalculateInterestAfterElevenMonths() {
        int initialBalance = 100;
        var premiumAccount = new PremiumAccount(initialBalance);

        int numberOfMonths = 11;
        var result = premiumAccount.applyInterest(numberOfMonths);

        double compoundInterest = Math.pow(1.02, numberOfMonths);
        var expected = initialBalance * compoundInterest;
        assertEquals(expected, result);
    }

    @Test
    void shouldCorrectlyCalculateInterestAfterAYear() {
        int initialBalance = 100;
        var premiumAccount = new PremiumAccount(initialBalance);

        var result = premiumAccount.applyInterest(12);

        var expected = initialBalance * Math.pow(1.02, 12) * 1.03;
        assertEquals(expected, result);
    }
}
