package open_closed.exercise_1.good.shape;

public record Rectangle(double width, double length) implements Shape {
    @Override
    public double calculateArea() {
        return length * width;
    }
}
