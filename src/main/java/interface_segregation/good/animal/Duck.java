package interface_segregation.good.animal;

import interface_segregation.good.interfaces.*;

public class Duck implements Animal, Walk, Fly, Swim, Quack {

    @Override
    public String nameOfAnimal() {
        return "duck";
    }

    @Override
    public String walk() {
        return "the " + nameOfAnimal() + " is walking!";
    }

    @Override
    public String fly() {
        return "the " + nameOfAnimal() + " is flying!";
    }

    @Override
    public String swim() {
        return "the " + nameOfAnimal() + " is swimming!";
    }

    @Override
    public String quack() {
        return "quack!";
    }

}
