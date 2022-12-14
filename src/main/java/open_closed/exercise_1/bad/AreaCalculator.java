package open_closed.exercise_1.bad;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class AreaCalculator {
    public static double calculateArea(Shape shape) {
        if (shape instanceof Circle circle) {
            return PI * pow(circle.getRadius(), 2);
        }

        if (shape instanceof Rectangle rectangle) {
            return rectangle.getLength() * ((Rectangle) shape).getWidth();
        }

        if (shape instanceof Square square) {
            return pow(square.getSide(), 2);
        }

        if (shape instanceof Triangle triangle) {
            var semiperimeter = (triangle.getA() + triangle.getB() + triangle.getC()) / 2;
            return Math.sqrt(
                    semiperimeter *
                            (semiperimeter - triangle.getA()) *
                            (semiperimeter - triangle.getB()) *
                            (semiperimeter - triangle.getC()));
        }
        throw new IllegalArgumentException("No matching Shape found");
    }
}
