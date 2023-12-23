public class Circle extends Shape {
    protected double radius;
    public Circle(){
        radius = 0;
        color = "";
        filled = false;
    }
    public Circle(double r){
        radius = r;
    }
    public Circle(double r, String c, boolean f){
        radius = r;
        color = c;
        filled = f;
    }
    public double getRadius(double radius){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius*radius;
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Color: "+this.color+". Filled: "+this.filled+". Radius = "+this.radius+". Area = "+this.getArea()+". Perimeter = "+this.getPerimeter();
    }
}
