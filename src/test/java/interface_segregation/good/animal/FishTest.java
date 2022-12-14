package interface_segregation.good.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FishTest {

    @Test
    void shouldSayTheNameOfTheAnimal() {
        var fish = new Fish();

        var result = fish.nameOfAnimal();

        assertEquals("fish", result);
    }

    @Test
    void swim() {
        var fish = new Fish();

        var result = fish.swim();

        assertEquals("the fish is swimming!", result);
    }
}