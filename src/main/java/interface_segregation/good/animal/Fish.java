package interface_segregation.good.animal;

import interface_segregation.good.interfaces.Animal;
import interface_segregation.good.interfaces.Swim;

public class Fish implements Animal, Swim {
    @Override
    public String nameOfAnimal() {
        return "fish";
    }

    @Override
    public String swim() {
        return "the " + nameOfAnimal() + " is swimming!";
    }
}
