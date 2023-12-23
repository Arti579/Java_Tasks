import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

public class ShapesInWindow extends JFrame {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    private Shape[] shapes;

    public ShapesInWindow() {
        setTitle("Shapes in Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(null);

        shapes = new Shape[20];

        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int randomX = random.nextInt(WINDOW_WIDTH);
            int randomY = random.nextInt(WINDOW_HEIGHT);

            if (i % 2 == 0) {
                int randomRadius = random.nextInt(50) + 20;
                shapes[i] = new Circle(randomColor, randomX, randomY, randomRadius);
            } else {
                int randomWidth = random.nextInt(100) + 50;
                int randomHeight = random.nextInt(100) + 50;
                shapes[i] = new Rectangle(randomColor, randomX, randomY, randomWidth, randomHeight);
            }
        }

        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ShapesInWindow();
            }
        });
    }
}
