package task01;

public class Main {
    public static void main(String[] args) {
        double totalArea = 0;

        GeometricFigure[] figures = {
                new Circle(32),
                new Triangle(24, 31),
                new Square(56),
        };

        for (GeometricFigure figure : figures) {
            totalArea += figure.area();
        }

        System.out.printf("The total area of all figures (cm2): %.2f%n", totalArea);
    }
}