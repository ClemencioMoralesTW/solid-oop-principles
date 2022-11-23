# SOLID OOP principles

Consider watching this video [here](https://www.youtube.com/watch?v=yxf2spbpTSw).

## Single Responsibility Principle (SRP)

* A class should have one, and only one, reason to change.
* Or, each class should have **a single responsibility**.
* If your class is big and is doing too many things, you're probably violating this.

## Open-Closed Principle (OCP)

* Entities (classes, methods, functions) should be:
    * Open for extension:
      * It should be simple to change the behavior of a class.
    * Closed for modifications:
      * Change the behavior of a class without modifying source code
      * And you do that by modifying the behaviour through extension.
      * Avoid code rot.
      * It’s very difficult to follow perfectly, it’s something you strive for.

## Liskov Substitution Principle (LSP)

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

## Interface Segregation Principle (ISP)

* A client should not be forced to implement an interface that it doesn't use.
* Separate fat interfaces into smaller interfaces.
* If you're breaking this, you may also be breaking SRP.

## Dependency Inversion Principle (DIP)

* Depend on abstractions, not on concretions.
    * High level modules should not depend upon low level modules. Instead they should depend upon abstractions.
      *  *High level code* isn’t concerned with the specific details.
    * Low level modules too should depend upon abstractions.
      * *Low level code* is more concerned with details and specifics.
* All of this allows for decoupling.
* _Not the same as dependency injection!_

# Read more
* [The Wikipedia page](https://en.wikipedia.org/wiki/SOLID_(object-oriented_design))
* [This explainer by Digital Ocean](https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design)
* Inspired by [this repo](https://github.com/training-yoyosan/solid-principles) in PHP by [Marius Palade (yoyosan)](https://github.com/yoyosan).
