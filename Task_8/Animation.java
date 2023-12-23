import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Animation extends JFrame {
    private BufferedImage[] frames;
    private int currentFrameIndex = 0;

    public Animation() {
        try {
            frames = new BufferedImage[4];
            for (int i = 0; i < frames.length; i++) {
                frames[i] = ImageIO.read(new File("C:\\Users\\artur\\Desktop\\ai\\meme" + (i + 1) + ".jpg"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Timer timer = new Timer(600, e -> {
            repaint();
            currentFrameIndex = (currentFrameIndex + 1) % frames.length;
        });
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(frames[currentFrameIndex], 50, 50, this);
    }

    public static void main(String[] args) {
        Animation frame = new Animation();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
