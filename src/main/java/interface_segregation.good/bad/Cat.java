package interface_segregation.good.bad;

public class Cat implements Animal {
    @Override
    public String nameOfAnimal() {
        return "cat";
    }

    @Override
    public String walk() {
        return "the " + nameOfAnimal() + " is walking!";
    }

    @Override
    public String fly() {
        return null;
    }

    @Override
    public String swim() {
        return null;
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
        return "meow!";
    }
}
