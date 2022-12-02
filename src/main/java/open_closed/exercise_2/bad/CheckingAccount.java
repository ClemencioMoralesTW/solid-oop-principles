package open_closed.exercise_2.bad;

import java.util.UUID;

public class CheckingAccount {
    private static final double WITHDRAW_FEE = 0.15;
    private final UUID accountId;
    private double balance;

    public CheckingAccount(double balance) {
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
        double amountAfterFees = amount + WITHDRAW_FEE;
        balance -= amountAfterFees;
        return amount;
    }

    public double applyInterest(int numberOfMonths) {
        return balance;
    }

    public double transfer(double amount, BasicAccount toAccount){
        balance -= amount;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, CheckingAccount toAccount){
        balance -= amount;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, MonthlyInterestAccount toAccount){
        balance -= amount;
        toAccount.deposit(amount);
        return balance;
    }

    public double transfer(double amount, YearlyInterestAccount toAccount){
        balance -= amount;
        toAccount.deposit(amount);
        return balance;
    }
}
