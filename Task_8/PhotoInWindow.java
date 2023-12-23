import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
public class PhotoInWindow extends JFrame{
    public static void main(String[] args) {
        String imageName = "C:\\Users\\artur\\Downloads\\photo_2023-11-14_02-12-39.jpg";

        if (!imageName.toLowerCase().endsWith(".png") &&
                !imageName.toLowerCase().endsWith(".jpeg") &&
                !imageName.toLowerCase().endsWith(".jpg")) {
            System.out.println("Invalid file format. Supported formats: .png, .jpeg, .jpg");
            return;
        }

        try {
            BufferedImage image = ImageIO.read(new File(imageName));

            JFrame frame = new JFrame("Image Display");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(image.getWidth(), image.getHeight());

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(image, 0, 0, this);
                }
            };

            frame.add(panel);
            frame.setVisible(true);
        } catch (IOException e) {
            System.out.println("Error loading the image: " + e.getMessage());
        }
    }
}
