# Dependency Inversion Principle (DIP)

* Depend on abstractions, not on concretions.
    * High level modules should not depend upon low level modules. Instead they should depend upon abstractions.
      *  *High level code* isn’t concerned with the specific details.
    * Low level modules too should depend upon abstractions.
      * *Low level code* is more concerned with details and specifics.
* All of this allows for decoupling.
* _Not the same as dependency injection!_

### DIP and Dependency Injection
Dependency injection significantly improves code comprehension and testability of code. For example, the application can behave differently, while in unit testing, testing, per-production or production.
If you have ever needed to mock something (and this is important for TDD!) you surely have heard and applied Dependency Injection.

DIP is about changing the direction of source code dependency of dependent module on a independent module(s), while keep the call flow from dependent to independent.
For example, an application service needing data from DB should not depend on Data Access Service (ReadRepository) of the lower layer. Instead, the application service should depend on abstraction at the same level.
I.e. an Interface of Data Access Service in same Application Service.

You will find that successful application of these abstractions goes hand in hand with DIP and Domain Driven Design (DDD).

### DIP and Domain Driven Design
DDD is one of those hot buzzwords that every developer seems to throw around. We won't go into a lot of detail because DDD is out of the scope of this bootcamp.

But As discussed earlier when DIP and Layered Architecture is used in an application the core domain is isolated into testable units like Entities, Value Objects and Domain Services.
This is the core idea behind DDD, so correct application of DIP will help you apply DDD principles.

## Exercise 1
You are given a calculator, which reads a line from the CLI and then performs a basic operation. But what if you wanted to take them from the arguments? Or read from a file?
Refactor all of these abstractions out of the **BasicCalculator** class.

## See also
[This Medium article](https://lahirukarunatilake.medium.com/dependency-inversion-principle-and-ddd-a446f453eb4)
