// Mac Dang - February 20, 2023
// AP Computer Science A - Mr. Schneider
// Project 7 - Lunch Counter
// Drink Class

public class Drink implements MenuItem {

    private String name;
    private double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
