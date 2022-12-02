package open_closed.exercise_2.bad;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class BankCustomer {
    private final List<BasicAccount> basicAccounts;
    private final List<CheckingAccount> checkingAccounts;
    private final List<MonthlyInterestAccount> monthlyInterestAccounts;
    private final List<YearlyInterestAccount> yearlyInterestAccounts;

    public BankCustomer() {
        basicAccounts = new ArrayList<>();
        checkingAccounts = new ArrayList<>();
        monthlyInterestAccounts = new ArrayList<>();
        yearlyInterestAccounts = new ArrayList<>();
    }

    public void openBasicAccount(double initialBalance) {
        basicAccounts.add(new BasicAccount(initialBalance));
    }

    public void openCheckingAccount(double initialBalance) {
        checkingAccounts.add(new CheckingAccount(initialBalance));
    }

    public void openMonthlyInterestAccount(double initialBalance) {
        monthlyInterestAccounts.add(new MonthlyInterestAccount(initialBalance));
    }

    public void openYearlyInterestAccount(double initialBalance) {
        yearlyInterestAccounts.add(new YearlyInterestAccount(initialBalance));
    }

    public void calculateInterest(int numberOfMonths) {
        for (var account : monthlyInterestAccounts) {
            account.applyInterest(numberOfMonths);
        }
        int numberOfYears = numberOfMonths % 12;
        for (var account : yearlyInterestAccounts) {
            account.applyInterest(numberOfYears);
        }
    }

    public List<UUID> getAllAccountIds() {
        ArrayList<UUID> uuids = new ArrayList<>();

        uuids.addAll(basicAccounts.stream().map(BasicAccount::getAccountId).collect(Collectors.toCollection(ArrayList::new)));
        uuids.addAll(checkingAccounts.stream().map(CheckingAccount::getAccountId).collect(Collectors.toCollection(ArrayList::new)));
        uuids.addAll(monthlyInterestAccounts.stream().map(MonthlyInterestAccount::getAccountId).collect(Collectors.toCollection(ArrayList::new)));
        uuids.addAll(yearlyInterestAccounts.stream().map(YearlyInterestAccount::getAccountId).collect(Collectors.toCollection(ArrayList::new)));

        return uuids;
    }

}
