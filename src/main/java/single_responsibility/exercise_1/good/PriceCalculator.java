package single_responsibility.exercise_1.good;

import single_responsibility.exercise_1.good.model.Country;
import single_responsibility.exercise_1.good.model.Order;
import single_responsibility.exercise_1.good.model.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PriceCalculator {
    public static double calculatePriceForProduct(Product product, Country country) {
        var result = BigDecimal.valueOf(product.price() * (1 + country.getVatForCountry())).setScale(2, RoundingMode.HALF_UP);
        return result.doubleValue();
    }

    public static double calculatePriceForOrder(Order order, Country country) {
        return order.quantity() * calculatePriceForProduct(order.product(), country);
    }
}
