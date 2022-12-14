package interface_segregation.good.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void shouldSayTheNameOfTheAnimal() {
        var cat = new Cat();

        var result = cat.nameOfAnimal();

        assertEquals("cat", result);
    }

    @Test
    void shouldWalk() {
        var cat = new Cat();

        var result = cat.walk();

        assertEquals("the cat is walking!", result);
    }

    @Test
    void shouldMeow() {
        var cat = new Cat();

        var result = cat.meow();

        assertEquals("meow!", result);
    }
}