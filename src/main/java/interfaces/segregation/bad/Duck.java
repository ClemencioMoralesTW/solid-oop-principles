package interfaces.segregation.bad;

public class Duck implements Animal {

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
    public String bark() {
        return null;
    }

    @Override
    public String quack() {
        return "quack!";
    }

    @Override
    public String meow() {
        return null;
    }
}
