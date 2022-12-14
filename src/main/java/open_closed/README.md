# Open-Closed Principle (OCP)

* Entities (classes, methods, functions) should be:
    * Open for extension:
      * It should be simple to change the behavior of a class.
    * Closed for modifications:
      * Change the behavior of a class without modifying source code
      * And you do that by modifying the behaviour through extension.
      * Avoid code rot.
    * The goal of the Open/Closed principle encourages us to design our software so we add new features only by adding new code. When this is possible, we have loosely coupled, and thus easily maintainable applications.
      * It’s very difficult to follow perfectly, it’s something you strive for.

# Exercise 1
You have an area calculator, and a bunch of shapes. Everytime you add a shape, you have to add new code to a method in the AreaCalculator. Refactor so that you can add any shape without having to touch the AreaCalculator. Add a Hexagon shape to test this.

# Exercise 2
Your client has several bank accounts. They have hired you, brave consultant, because they notice that every time they add a new account, they have to alter code in other classes in the code base.
You are tasked with adding:
* Refactoring the codebase so that this is no longer the case
* Adding an account called "Premium Account" which has no cash or withdrawal fees, a monthly interest of 2% and a yearly interest of 3%.

As always, remember to apply TDD and best practices!