package task01;

public class Square implements GeometricFigure {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}