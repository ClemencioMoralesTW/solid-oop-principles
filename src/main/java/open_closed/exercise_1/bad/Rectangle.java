package open_closed.exercise_1.bad;

public class Rectangle extends Shape {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getHeight() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
