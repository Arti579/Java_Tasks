public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Pi_number * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Pi_number * radius;
    }
}