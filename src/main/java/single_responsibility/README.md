# Single Responsibility Principle (SRP)

* A class should have one, and only one, reason to change.
* Or, each class should have **a single responsibility**.
* If your class is big and is doing too many things, you're probably violating this.
  * Another code smell to look for is logic within models.

## Exercise 1
You are given a "Product" class, and are told to add a new country, France, since you are expanding to the French market. (French VAT is 20%)

You open the class and discover a mess! You decide to refactor this following the Single Responsibility Principle, and add the French VAT functionality. Remember to use TDD!

## Exercise 2
Your team has a MediaConfig class which is used to save the properties of images, video and music. This is causing bugs and your team resolves in a tech huddle that it needs to be split. Think about how you want to split it.
(FPS = frames per second, used in video)