package single_responsibility.exercise_1.good;

import org.junit.jupiter.api.Test;
import single_responsibility.exercise_1.good.model.Order;
import single_responsibility.exercise_1.good.model.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static single_responsibility.exercise_1.good.model.Country.FRANCE;
import static single_responsibility.exercise_1.good.model.Country.GERMANY;
import static single_responsibility.exercise_1.good.model.Country.SPAIN;
import static single_responsibility.exercise_1.good.model.Country.UK;

class PriceCalculatorTest {

    Product testProduct = new Product("a product", 12.50);
    private Order testOrder = new Order(testProduct, 3);

    @Test
    void shouldCalculateCorrectVatForProductInGermany() {
        var result = PriceCalculator.calculatePriceForProduct(testProduct, GERMANY);

        assertEquals(14.88, result);
    }

    @Test
    void shouldCalculateCorrectVatForProductInSpain() {
        var result = PriceCalculator.calculatePriceForProduct(testProduct, SPAIN);

        assertEquals(15.13, result);
    }

    @Test
    void shouldCalculateCorrectVatForProductInUK() {
        var result = PriceCalculator.calculatePriceForProduct(testProduct, UK);

        assertEquals(15.00, result);
    }

    @Test
    void shouldCalculateCorrectVatForProductInFrance() {
        var result = PriceCalculator.calculatePriceForProduct(testProduct, FRANCE);

        assertEquals(15.00, result);
    }

    @Test
    void shouldCalculateCorrectVatForOrderInGermany() {
        var result = PriceCalculator.calculatePriceForOrder(testOrder, GERMANY);

        assertEquals(44.64, result);
    }

    @Test
    void shouldCalculateCorrectVatForOrderInSpain() {
        var result = PriceCalculator.calculatePriceForOrder(testOrder, SPAIN);

        assertEquals(45.39, result);
    }

    @Test
    void shouldCalculateCorrectVatForOrderInUK() {
        var result = PriceCalculator.calculatePriceForOrder(testOrder, UK);

        assertEquals(45.00, result);
    }

    @Test
    void shouldCalculateCorrectVatForOrderInFrance() {
        var result = PriceCalculator.calculatePriceForOrder(testOrder, FRANCE);

        assertEquals(45.00, result);
    }
}