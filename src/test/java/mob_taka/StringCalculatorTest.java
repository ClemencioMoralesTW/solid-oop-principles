package mob_taka;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void shouldReturn0IfStringIsEmpty(){
        Integer expected = 0;
        Integer result = stringCalculator.add("");

        assertEquals(expected, result);
    }
}
