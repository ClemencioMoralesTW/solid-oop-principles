package interface_segregation.good.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    @Test
    void shouldSayTheNameOfTheAnimal() {
        var duck = new Duck();

        var result = duck.nameOfAnimal();

        assertEquals("duck", result);
    }

    @Test
    void shouldWalk() {
        var duck = new Duck();

        var result = duck.walk();

        assertEquals("the duck is walking!", result);
    }

    @Test
    void fly() {
        var duck = new Duck();

        var result = duck.fly();

        assertEquals("the duck is flying!", result);
    }

    @Test
    void swim() {
        var duck = new Duck();

        var result = duck.swim();

        assertEquals("the duck is swimming!", result);
    }

    @Test
    void quack() {
        var duck = new Duck();

        var result = duck.quack();

        assertEquals("quack!", result);
    }
}