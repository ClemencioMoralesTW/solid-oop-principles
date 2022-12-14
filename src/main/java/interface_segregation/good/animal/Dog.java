package interface_segregation.good.animal;

import interface_segregation.good.interfaces.Animal;
import interface_segregation.good.interfaces.Bark;
import interface_segregation.good.interfaces.Walk;

public class Dog implements Animal, Walk, Bark {
    @Override
    public String nameOfAnimal() {
        return "dog";
    }

    @Override
    public String walk() {
        return "the " + nameOfAnimal() + " is walking!";
    }

    @Override
    public String bark() {
        return "woof!";
    }
}
