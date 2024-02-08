// Mac Dang - October 19, 2022
// Mr. Schneider - AP Computer Science A
// distanceProject - Project 3

// I can see how this could be similar to the formatting of the sixDays project but this just the way I thought of how to do this.
// Also I got IntelliJ working on my PC which is great.

public class distanceProject {
    public static void main(String[] args) {
        double a = (distance(16, 10, 21, 21));  // I used Tacoma (16, 10) and Auburn (21, 21)
        System.out.println("The answer to exercise 1 is " + a); // a = distance from first city to second city

        double b = (distance(21, 21, 10, 3) + a); // Third city I used was Spanaway (10, 3)
        System.out.println("The answer to exercise 2 is " + b); // b = a + distance from second city to third city

        double c = (distance(10, 3, 16, 10) + b); // c = b + distance from third city to first city
        System.out.println("The answer to exercise 3 is " + c);
    }
    public static double distance(int x1,int y1,int x2,int y2) {
        double calculateDistance = Math.sqrt((y2-y1) * (y2-y1) + (x2-x1) * (x2-x1)); // Distance formula
        return calculateDistance; // return formula to main so I can input numbers and use this same formula for different inputs later on
    }
}