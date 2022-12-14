package interface_segregation.good.animal;

import interface_segregation.good.interfaces.Animal;
import interface_segregation.good.interfaces.Meow;
import interface_segregation.good.interfaces.Walk;

public class Cat implements Animal, Walk, Meow {
    @Override
    public String nameOfAnimal() {
        return "cat";
    }

    @Override
    public String walk() {
        return "the " + nameOfAnimal() + " is walking!";
    }

    @Override
    public String meow() {
        return "meow!";
    }
}
