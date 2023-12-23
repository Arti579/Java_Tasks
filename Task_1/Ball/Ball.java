public class Ball {
    private String color;
    private int weight;
    public Ball(String c, int w){
        color = c;
        weight = w;
    }
    public Ball(String c){
        color = c;
        weight = 0;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }
    public String toString(){
        return this.color+ ", weight is "+this.weight;
    }
    public void BallsWeightSomething(){
        System.out.println(color+"'s age in humans years is " +weight*7+ " years");
    }
}
