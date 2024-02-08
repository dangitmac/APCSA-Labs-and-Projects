// Mac Dang - February 20, 2023
// AP Computer Science A - Mr. Schneider
// Project 7 - Lunch Counter
// Trio Class

public class Trio implements MenuItem {

    private String name;
    private double price;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {

        price = 0;

        double i = sandwich.getPrice();
        double j = salad.getPrice();
        double k = drink.getPrice();

        if (i <= j && i <= k) {
            price = j + k;
        }

        else if (j <= i && j <= k) {
            price = i + k;
        }

        else if (k <= j && k <= i) {
            price = i + j;
        }

        name = "" + sandwich.getName() + " - " + sandwich.getPrice() + " / " + salad.getName() + " - " + salad.getPrice() + " / " + drink.getName() + " - " + drink.getPrice();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
