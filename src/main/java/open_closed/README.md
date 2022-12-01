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

# Excercise
You have an area calculator, and a bunch of shapes. Everytime you add a shape, you have to add a new code method to the AreaCalculator. Refactor so that you can add any shape without having to touch the AreaCalculator. Add a Hexagon shape to test this. 