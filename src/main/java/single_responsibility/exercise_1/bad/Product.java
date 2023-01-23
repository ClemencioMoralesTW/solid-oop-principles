package single_responsibility.exercise_1.bad;

public class Product {
    private final String name;
    private final double price;
    private final double VAT_GERMANY = 0.19;
    private final double VAT_SPAIN = 0.21;
    private final double VAT_UK = 0.2;

    private final double VAT_FRANCE = 0.2;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculatePriceWithTax(Country country) {
        return switch (country) {
            case GERMANY -> this.price * VAT_GERMANY;
            case SPAIN -> this.price * VAT_SPAIN;
            case FRANCE -> this.price * VAT_FRANCE;
            case UK ->  this.price * VAT_UK;
        };
    }

    public double calculateTotalPriceWithTaxForOrder(int quantity, Country country) {
        return quantity * calculatePriceWithTax(country);
    }

    public enum Country {
        GERMANY,
        SPAIN,
        FRANCE,
        UK
    }
}