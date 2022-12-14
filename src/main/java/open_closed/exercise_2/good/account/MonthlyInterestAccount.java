package open_closed.exercise_2.good.account;

public class MonthlyInterestAccount extends BankAccount{

    private static final double WITHDRAW_FEE = 1;
    private static final double TRANSFER_FEE = 2;
    private static final double MONTHLY_INTEREST = 0.01;

    public MonthlyInterestAccount(double balance) {
        super(balance);
    }

    public double withdraw(double amount) {
        balance -= amount - WITHDRAW_FEE;
        return balance;
    }

    public double applyInterest(int numberOfMonths) {
        double compoundInterest = java.lang.Math.pow((1 + MONTHLY_INTEREST), numberOfMonths);
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
