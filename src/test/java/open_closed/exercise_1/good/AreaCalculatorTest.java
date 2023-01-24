package open_closed.exercise_1.good;

import open_closed.exercise_1.good.shape.Circle;
import open_closed.exercise_1.good.shape.Hexagon;
import open_closed.exercise_1.good.shape.Rectangle;
import open_closed.exercise_1.good.shape.Shape;
import open_closed.exercise_1.good.shape.Square;
import open_closed.exercise_1.good.shape.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaCalculatorTest {

    @Test
    void shouldCalculateTheAreaOfACircle() {
        Shape circle = new Circle(5);
        assertEquals(78.54, AreaCalculator.calculateArea(circle), 0.005);
    }

    @Test
    void shouldCalculateTheAreaOfARectangle() {
        Shape rectangle = new Rectangle(4, 5);
        assertEquals(20, AreaCalculator.calculateArea(rectangle));
    }

    @Test
    void shouldCalculateTheAreaOfASquare() {
        Shape square = new Square(3);
        assertEquals(9, AreaCalculator.calculateArea(square));
    }

    @Test
    void shouldCalculateTheAreaOfATriangle() {
        Shape triangle = new Triangle(10, 16, 25);
        assertEquals(43.33, AreaCalculator.calculateArea(triangle), 0.005);
    }

    @Test
    void shouldCalculateTheAreaOfAHexagon() {
        Shape hexagon = new Hexagon(5);
        assertEquals(64.95, AreaCalculator.calculateArea(hexagon), 0.005);
    }
}