package open_closed.exercise_1.good.shape;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public record Circle(double radius) implements Shape {

    @Override
    public double calculateArea() {
        return PI * pow(radius, 2);
    }
}
