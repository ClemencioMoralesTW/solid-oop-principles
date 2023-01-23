package single_responsibility.exercise_1.good;

import org.junit.jupiter.api.Test;
import single_responsibility.exercise_1.bad.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    public void calculateFrancePrice10WithTax(){
        Product product = new Product("testProduct", 10.0);

        double result = product.calculatePriceWithTax(Product.Country.FRANCE);
        double expected = 2.0;


        assertEquals(expected, result);

    }

    @Test
    public void calculateFrancePrice20WithTax(){
        Product product = new Product("testProduct", 20.0);

        double result = product.calculatePriceWithTax(Product.Country.FRANCE);
        double expected = 4.0;


        assertEquals(expected, result);

    }

}