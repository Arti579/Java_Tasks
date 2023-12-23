public class MovablePoint implements Movable{
    public void moveUp(){
        y += ySpeed;
    }
    public void moveDown(){
        y -= ySpeed;
    }
    public void moveLeft(){
        x += xSpeed;
    }
    public void moveRight(){
        x -= xSpeed;
    }

    protected int x; protected int y; protected int xSpeed; protected int ySpeed;

    public MovablePoint(int xc, int yc, int xcSpeed, int ycSpeed){
        x = xc;
        y = yc;
        xSpeed = xcSpeed;
        ySpeed = ycSpeed;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
}
