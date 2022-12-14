package open_closed.exercise_1.good.shape;

public record Square(double side) implements Shape {

    @Override
    public double calculateArea() {
        return side * side;
    }
}
