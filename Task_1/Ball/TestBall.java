import java.lang.*;
public class TestBall {
    public static void main (String[] args){
        Ball d1 = new Ball("Red", 2);
        Ball d2 = new Ball("Green", 7);
        Ball d3 = new Ball("Blue");
        d3.setWeight(1);
        System.out.println(d1);
        d1.BallsWeightSomething();
        d2.BallsWeightSomething();
        d3.BallsWeightSomething();
    }
}
