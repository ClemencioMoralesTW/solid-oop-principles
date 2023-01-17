# Liskov Substitution Principle (LSP)

* Mathematical definition: Let *q(x)* be a property provable about objects *x* of type *T*. Then *q(y)* should be provable for objects *y* of type *S*, where *S* is a subtype of *T*.
* In a computer program
    * If *B* is a subtype of *A*, then objects of type *A* may be replaced with objects of type *B*.
    * **Derived classes must be substitutable for their base classes**.
* Here is a list of ways to adhere to LSP:
    * Signature must match
    * Preconditions can’t be greater
    * Post conditions at least equal to
    * Exception types must match
* This basically inheritance. Classes that use a super class should be able to use subclasses derived from it.


# Excercise 1

The path `src/main/java/liskov_substitution/exercise_1/bad` contains an example that breaks
Liskov Substitution Principle. It represents a set of accounts that a bank offers:

* `BankingAppWithdrawalService`: Uses an account to withdraw money.
* `Account`: Abstract class that allows to deposit and withdraw money. Has 3 implementations:
  * `CurrentAccount`: Allows deposits and withdrawals.
  * `SavingsAccount`: Allows deposits and withdrawals.
  * `FixedTermDepositAccount`: Just allows deposits, **and does not allow withdrawals**.

The fact FixedTermDepositAccount does not allow withdrawals breaks Liskov Substitution Principle (LSP),
as long as not every subtype is interchangeable.
**_Refactor all code in a new package that does not break LSP._** (No need to actually add a balance.)

Hint: It feels like some accounts are withdrawable and others are not...