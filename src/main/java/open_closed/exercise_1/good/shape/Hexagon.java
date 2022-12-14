package open_closed.exercise_1.good.shape;

import open_closed.exercise_1.good.shape.Shape;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public record Hexagon(double side) implements Shape {

    @Override
    public double calculateArea() {
        return ((3 * sqrt(3))/2) * pow(side, 2);
    }
}
