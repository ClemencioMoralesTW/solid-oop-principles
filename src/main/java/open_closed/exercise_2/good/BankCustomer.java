package open_closed.exercise_2.good;

import open_closed.exercise_2.good.account.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class BankCustomer {
    private final List<BankAccount> accounts;

    public BankCustomer() {
        accounts = new ArrayList<>();
    }

    public void openBasicAccount(double initialBalance) {
        accounts.add(new BasicAccount(initialBalance));
    }

    public void openCheckingAccount(double initialBalance) {
        accounts.add(new CheckingAccount(initialBalance));
    }

    public void openMonthlyInterestAccount(double initialBalance) {
        accounts.add(new MonthlyInterestAccount(initialBalance));
    }

    public void openYearlyInterestAccount(double initialBalance) {
        accounts.add(new YearlyInterestAccount(initialBalance));
    }

    public void calculateInterest(int numberOfMonths) {
        for (var account : accounts) {
            account.applyInterest(numberOfMonths);
        }
    }

    public List<UUID> getAllAccountIds() {

        ArrayList<UUID> uuids = accounts.stream()
                .map(BankAccount::getAccountId)
                .collect(Collectors.toCollection(ArrayList::new));

        return uuids;
    }

}
