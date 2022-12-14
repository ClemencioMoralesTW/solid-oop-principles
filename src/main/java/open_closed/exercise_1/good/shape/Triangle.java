package open_closed.exercise_1.good.shape;

public record Triangle(double a, double b, double c) implements Shape {

    @Override
    public double calculateArea() {
        var semiperimeter = (a + b + c) / 2;
        return Math.sqrt(
                semiperimeter *
                        (semiperimeter - a) *
                        (semiperimeter - b) *
                        (semiperimeter - c));

    }
}
