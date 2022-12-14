package open_closed.exercise_2.good.account;

import java.util.UUID;

public class YearlyInterestAccount extends BankAccount {
    private static final double YEARLY_INTEREST = 0.05;
    private static final double WITHDRAW_FEE = 1.5;
    private static final double TRANSFER_FEE = 2.5;
    public YearlyInterestAccount(double balance) {
        super(balance);
    }

    public double withdraw(double amount) {
        double amountAfterFees = amount + WITHDRAW_FEE;
        balance -= amountAfterFees;
        return amount;
    }

    public double applyInterest(int numberOfMonths) {
        int numberOfYears = numberOfMonths / 12;
        double compoundInterest = java.lang.Math.pow((1 + YEARLY_INTEREST), numberOfYears);
        balance = balance + (compoundInterest * balance);
        return balance;
    }

    public double transfer(double amount, BankAccount toAccount) {
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }
}
