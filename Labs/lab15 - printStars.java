// Mac Dang - April 2, 2023
// AP Computer Science A - Mr. Schneider
// lab15 - printStars

public class lab15 {
    public static void main(String[] args) {
        System.out.println("print stars with recursion");
        printStarsRecursion(5);
        System.out.println();
        System.out.println("print stars with iterate");
        printStarsLoop(5);
    }

    public static void printStarsLoop(int j) {
        for (int i = j; i > 0; i--) {
            System.out.println(i + "\t*");
        }
    }

    public static void printStarsRecursion(int j) {
        if (j == 0) {
            return;
        }
        System.out.println(j + "\t*");
        printStarsRecursion(j - 1);
    }
}
