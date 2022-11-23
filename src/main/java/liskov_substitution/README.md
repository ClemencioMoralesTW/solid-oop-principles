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