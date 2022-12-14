package open_closed.exercise_2.good.account;

import static java.lang.Math.pow;

public class PremiumAccount extends BankAccount {
    private static final double MONTHLY_INTEREST = 0.02;
    private static final double YEARLY_INTEREST = 0.03;

    public PremiumAccount(double balance) {
        super(balance);
    }

    public double withdraw(double amount) {
        return balance -= amount;
    }

    @Override
    public double applyInterest(int numberOfMonths) {
        double compoundMonthlyInterest = pow((1 + MONTHLY_INTEREST), numberOfMonths);
        balance = balance * compoundMonthlyInterest;
        int numberOfYears = numberOfMonths / 12;
        double compoundYearlyInterest = pow((1 + YEARLY_INTEREST), numberOfYears);
        balance = balance * compoundYearlyInterest;
        return balance;
    }

    @Override
    public double transfer(double amount, BankAccount toAccount) {
        balance -= amount;
        toAccount.deposit(amount);
        return balance;
    }
}
