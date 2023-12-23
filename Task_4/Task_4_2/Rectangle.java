public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        width = 0;
        length = 0;
        color = "";
        filled = false;
    }
    public Rectangle(double w, double l){
        width = w;
        length = l;
    }
    public Rectangle(double w, double l, String c, boolean f){
        width = w;
        length = l;
        color = c;
        filled = f;
    }
    public double getWidth(double width){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(double length){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }
    public double getPerimeter() {
        return (length + width) * 2;
    }
    public String toString(){
        return "Color: "+this.color+". Filled: "+this.filled+". Width = "+this.width+". Length = "+this.length+". Area = "+this.getArea()+". Perimeter = "+this.getPerimeter();
    }
}
