package single_responsibility.exercise_1.good.model;

public enum Country {
    GERMANY,
    SPAIN,
    UK,
    FRANCE;

    private final double VAT_GERMANY = 0.19;
    private final double VAT_SPAIN = 0.21;
    private final double VAT_UK = 0.2;
    private final double VAT_FRANCE = 0.2;

    public double getVatForCountry() {
        return switch (this) {
            case GERMANY -> VAT_GERMANY;
            case SPAIN -> VAT_SPAIN;
            case UK -> VAT_UK;
            case FRANCE -> VAT_FRANCE;
        };
    }
}
