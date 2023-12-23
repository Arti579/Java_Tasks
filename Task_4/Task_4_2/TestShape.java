public class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle(2.2, "Red", true);
        Rectangle r = new Rectangle(4.3, 5.0, "Blue", false);
        Square s = new Square(3.2, "Yellow", true);

        System.out.println("Circle: \n"+c);
        System.out.println("Rectangle: \n"+r);
        System.out.println("Square: \n"+s);
    }
}
