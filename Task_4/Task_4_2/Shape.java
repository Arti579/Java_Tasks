public abstract class Shape {
    protected String color;
    protected boolean filled;
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
    public Shape(){
        color = "";
        filled = false;
    }
    public Shape(String c, boolean f){
        color = c;
        filled = f;
    }
    public String getColor(String color){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(boolean filled){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
}
