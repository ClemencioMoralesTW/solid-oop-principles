package open_closed.exercise_2.good.account;

public class CheckingAccount extends BankAccount {
    private static final double WITHDRAW_FEE = 0.15;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public double withdraw(double amount) {
        double amountAfterFees = amount + WITHDRAW_FEE;
        balance -= amountAfterFees;
        return amount;
    }

    public double applyInterest(int numberOfMonths) {
        return balance;
    }

    public double transfer(double amount, BankAccount toAccount) {
        balance -= amount;
        toAccount.deposit(amount);
        return balance;
    }
}
