package open_closed.exercise_2.bad;

import java.util.UUID;

public class MonthlyInterestAccount {

    private static final double WITHDRAW_FEE = 1;
    private static final double TRANSFER_FEE = 2;
    private static final double MONTHLY_INTEREST = 0.01;
    private final UUID accountId;
    private double balance;

    public MonthlyInterestAccount(double balance) {
        this.balance = balance;
        accountId = UUID.randomUUID();
    }

    public UUID getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance -= amount - WITHDRAW_FEE;
        return balance;
    }

    public double applyInterest(int numberOfMonths) {
        double compoundInterest = java.lang.Math.pow((1 + MONTHLY_INTEREST), numberOfMonths);
        balance = balance * compoundInterest;
        return balance;
    }

    public double transfer(double amount, BasicAccount toAccount){
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, CheckingAccount toAccount){
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, MonthlyInterestAccount toAccount){
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, YearlyInterestAccount toAccount){
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }
}
