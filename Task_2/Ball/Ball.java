import java.lang.*;
public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x1, double y1){
        x = x1;
        y = y1;
    }
    public Ball(){
        x = 0.0;
        y = 0.0;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getX(){
        return x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getY(){
        return y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball (" + x + ", " + y + ")";
    }
}
