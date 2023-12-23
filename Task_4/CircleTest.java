class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Радиус окружности: " + circle.getRadius());
        System.out.println("Площадь окружности: " + circle.calculateArea());
        circle.setRadius(7);
        System.out.println("Новый радиус окружности: " + circle.getRadius());
        System.out.println("Новая площадь окружности: " + circle.calculateArea());
    }
}
