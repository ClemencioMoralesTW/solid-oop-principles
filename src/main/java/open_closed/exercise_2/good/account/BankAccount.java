package open_closed.exercise_2.good.account;

import java.util.UUID;

public abstract class BankAccount {

    protected double balance;
    private final UUID accountId;

    public BankAccount(double balance) {
        this.balance = balance;
        accountId = UUID.randomUUID();
    }

    public double getBalance() {
        return balance;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public abstract double withdraw(double amount);
    public abstract double applyInterest(int numberOfMonths);
    public abstract double transfer(double amount, BankAccount toAccount);

}
