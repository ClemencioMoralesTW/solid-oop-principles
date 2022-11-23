package interfaces.segregation.bad;

public class Fish implements Animal{
    @Override
    public String nameOfAnimal() {
        return "fish";
    }

    @Override
    public String walk() {
        return null;
    }

    @Override
    public String fly() {
        return null;
    }

    @Override
    public String swim() {
        return "the " + nameOfAnimal() + " is swimming!";
    }

    @Override
    public String bark() {
        return null;
    }

    @Override
    public String quack() {
        return null;
    }

    @Override
    public String meow() {
        return null;
    }
}
