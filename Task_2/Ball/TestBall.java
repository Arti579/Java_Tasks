import java.lang.*;
public class TestBall {
    public static void main (String[] args) {
        Ball ball = new Ball();
        System.out.println("X: "+ ball.getX()+"; Y: "+ball.getY()+";");
        ball.move(0.5, -0.5);
        System.out.println(ball.toString());
    }
}
