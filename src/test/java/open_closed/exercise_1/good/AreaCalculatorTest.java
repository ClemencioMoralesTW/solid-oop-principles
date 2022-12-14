package open_closed.exercise_1.good;

import open_closed.exercise_1.good.shape.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    @Test
    void shouldCalculateTheAreaOfACircle() {
        var circle = new Circle(5);

        var result = AreaCalculator.calculateArea(circle);

        assertEquals(78.54, result, 0.005);
    }

    @Test
    void shouldCalculateTheAreaOfARectangle() {
        var rectangle = new Rectangle(4, 5);

        var result = AreaCalculator.calculateArea(rectangle);

        assertEquals(20, result);
    }

    @Test
    void shouldCalculateTheAreaOfASquare() {
        var square = new Square(3);

        var result = AreaCalculator.calculateArea(square);

        assertEquals(9, result);
    }

    @Test
    void shouldCalculateTheAreaOfATriangle() {
        var triangle = new Triangle(10, 16, 25);

        var result = AreaCalculator.calculateArea(triangle);

        assertEquals(43.33, result, 0.005);
    }

    @Test
    void shouldCalculateTheAreaOfAHexagon() {
        var hexagon = new Hexagon(5);

        var result = AreaCalculator.calculateArea(hexagon);

        assertEquals(64.95, result, 0.005);
    }
}