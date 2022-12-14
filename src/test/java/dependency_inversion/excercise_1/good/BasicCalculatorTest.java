package dependency_inversion.excercise_1.good;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        var input = "2 + 3";

        var result = BasicCalculator.calculate(input);

        assertEquals("5", result);
    }

    @Test
    void shouldSubstractTwoNumbers() {
        var input = "2 - 4";

        var result = BasicCalculator.calculate(input);

        assertEquals("-2", result);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        var input = "3 * 15";

        var result = BasicCalculator.calculate(input);

        assertEquals("45", result);
    }

    @Test
    void shouldDivideTwoNumbers() {
        var input = "30 / 10";

        var result = BasicCalculator.calculate(input);

        assertEquals("3", result);
    }

    @Test
    void shouldModuloTwoNumbers() {
        var input = "15 % 12";

        var result = BasicCalculator.calculate(input);

        assertEquals("3", result);
    }
}