package interface_segregation.good.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void shouldSayTheNameOfTheAnimal() {
        var dog = new Dog();

        var result = dog.nameOfAnimal();

        assertEquals("dog", result);
    }

    @Test
    void shouldWalk() {
        var dog = new Dog();

        var result = dog.walk();

        assertEquals("the dog is walking!", result);
    }

    @Test
    void shouldMeow() {
        var dog = new Dog();

        var result = dog.bark();

        assertEquals("woof!", result);
    }
}