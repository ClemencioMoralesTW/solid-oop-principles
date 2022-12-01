package open_closed.bad;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class AreaCalculator {

    public static void printArea(Shape shape){
        System.out.println("The area of the shape is: " + calculateArea(shape));
    }
    private static double calculateArea(Shape shape) {
        if (shape instanceof Circle) {
            return PI * pow(((Circle) shape).getRadius(), 2);
        }

        if (shape instanceof Rectangle) {
            return ((Rectangle) shape).getHeight() * ((Rectangle) shape).getWidth();
        }

        if (shape instanceof Square) {
            return pow(((Square) shape).getSide(), 2);
        }

        if (shape instanceof Triangle) {
            var triangle = (Triangle) shape;
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
