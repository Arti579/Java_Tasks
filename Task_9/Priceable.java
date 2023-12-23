public interface Priceable {
    int getPrice();
}

class Milk implements Priceable {
    private int MilkPrice;
    public Milk(int MilkPrice) {
        this.MilkPrice = MilkPrice;
    }
    public int getPrice() {
        return MilkPrice;
    }
}
class Bread implements Priceable {
    private int BreadPrice;
    public Bread(int BreadPrice){
        this.BreadPrice = BreadPrice;
    }
    public int getPrice(){
        return BreadPrice;
    }
}