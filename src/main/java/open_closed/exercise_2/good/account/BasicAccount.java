package open_closed.exercise_2.good.account;

public class BasicAccount extends BankAccount {

    private static final double WITHDRAW_FEE = 0.1;
    private static final double TRANSFER_FEE = 1.5;

    public BasicAccount(double balance) {
        super(balance);
    }

    public double withdraw(double amount) {
        double amountAfterFees = amount + WITHDRAW_FEE;
        balance -= amountAfterFees;
        return amount;
    }

    @Override
    public double transfer(double amount, BankAccount toAccount) {
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }

    public double applyInterest(int numberOfMonths) {
        return balance;
    }

}
