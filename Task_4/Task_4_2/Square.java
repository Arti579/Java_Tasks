public class Square extends Rectangle{
    protected double side;
    public Square(){
        side = 0;
        color = "";
        filled = false;
    }
    public Square(double s){
        side = s;
    }
    public Square(double s, String c, boolean f){
        side = s;
        color = c;
        filled = f;
    }
    public double getSide(double side){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setWidth(double side){
        super.width = side;
    }
    public void setLength(double side){
        super.length = side;
    }
    public String toString(){
        return "Color: "+this.color+". Filled: "+this.filled+". Width = Length = "+this.side+". Area = "+this.getArea()+". Perimeter = "+this.getPerimeter();
    }
}
