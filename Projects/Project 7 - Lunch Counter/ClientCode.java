// Mac Dang - February 20, 2023
// AP Computer Science A - Mr. Schneider
// Project 7 - Lunch Counter
// Client Code Class

public class ClientCode {
    public static void main(String[] args) {

        Sandwich sandwich1 = new Sandwich("Cheeseburger",5.55);
        Sandwich sandwich2 = new Sandwich("Club Sandwich",4.75);
        Sandwich sandwich3 = new Sandwich("Chicken Sandwich",5.25);

        Salad salad1 = new Salad("Spinach Salad",4.25);
        Salad salad2 = new Salad("Coleslaw",3.25);
        Salad salad3 = new Salad("Cobb Salad",5.25);

        Drink drink1 = new Drink("Orange Soda",1.25);
        Drink drink2 = new Drink("Cappuccino",3.50);
        Drink drink3 = new Drink("Milk Shake",5.50);

        Trio trio1 = new Trio(sandwich1, salad1, drink1);
        System.out.println(""+ trio1.getName() + " \nTrio Price: $" + trio1.getPrice());

        Trio trio2 = new Trio(sandwich2,salad2,drink2);
        System.out.println("\n"+ trio2.getName() + " \nTrio Price: $" + trio2.getPrice());

        Trio trio3 = new Trio(sandwich3,salad3,drink3);
        System.out.println("\n"+ trio3.getName() + " \nTrio Price: $" + trio3.getPrice());
    }
}