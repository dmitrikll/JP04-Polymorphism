package task01;

public class Triangle implements GeometricFigure {
    private final double side;
    private final double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * side * height;
    }
}