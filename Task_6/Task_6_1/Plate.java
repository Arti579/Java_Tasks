class Plate extends Dish {
    private int diameter;

    public Plate(String material, String color, int diameter) {
        super(material, color);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void wash() {
        System.out.println("Washing a plate");
    }
}