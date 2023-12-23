abstract class Furniture {
    private String name;
    private double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void displayInfo();
}

class Chair extends Furniture {
    public Chair(String name, double price) {
        super(name, price);
    }

    public void displayInfo() {
        System.out.println("Chair - Name: " + getName() + ", Price: " + getPrice());
    }
}

class Table extends Furniture {
    public Table(String name, double price) {
        super(name, price);
    }

    public void displayInfo() {
        System.out.println("Table - Name: " + getName() + ", Price: " + getPrice());
    }
}

class FurnitureShop {
    private Furniture[] inventory;

    public FurnitureShop(Furniture[] inventory) {
        this.inventory = inventory;
    }

    public void displayInventory() {
        System.out.println("Furniture Inventory:");
        for (Furniture item : inventory) {
            item.displayInfo();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Furniture[] inventory = new Furniture[3];
        inventory[0] = new Chair("Wooden Chair", 100.0);
        inventory[1] = new Table("Coffee Table", 200.0);
        inventory[2] = new Chair("Armchair", 150.0);

        FurnitureShop shop = new FurnitureShop(inventory);
        shop.displayInventory();
    }
}