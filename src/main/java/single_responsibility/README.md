# Single Responsibility Principle (SRP)

* A class should have one, and only one, reason to change.
* Or, each class should have **a single responsibility**.
* If your class is big and is doing too many things, you're probably violating this.

## Exercise
You are given a "Product" class, and are told to add a new country, France, since you are expanding to the French market. (French VAT is 20%)

You open the class and discover a mess! You decide to refactor this following the Single Responsibility Principle, and add the French VAT functionality. Remember to use TDD!