package open_closed.exercise_2.good.account;

public class TransferWithFeesAccount extends BankAccount {
    private static final double TRANSFER_FEE = 5;

    public TransferWithFeesAccount(double balance) {
        super(balance);
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    public double applyInterest(int numberOfMonths) {
        return balance;
    }

    public double transfer(double amount, BankAccount toAccount) {
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }
}
