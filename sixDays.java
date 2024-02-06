// Mac Dang - September 12, 2022
// Mr. Schneider - AP Computer Science A Period 1
// sixDays Project

public class sixDays {
    public static void main(String[] args) {
        oneXmas();
        twoXmas();
        threeXmas();
        fourXmas();
        fiveXmas();
        sixXmas();
    }

    public static void oneXmas() {
        System.out.println("On the 1st day of \"Xmas\", my true love sent to me");
        onePearTree();
    }

    public static void twoXmas() {
        System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");
        twoTurtleDoves();
    }

    public static void threeXmas() {
        System.out.println("On the 3rd day of \"Xmas\", my true love sent to me");
        threeFrenchHens();
    }

    public static void fourXmas() {
        System.out.println("On the 4th day of \"Xmas\", my true love sent to me");
        fourCallingBirds();
    }

    public static void fiveXmas() {
        System.out.println("On the 5th day of \"Xmas\", my true love sent to me");
        fiveGoldenRings();
    }

    public static void sixXmas() {
        System.out.println("On the 6th day of \"Xmas\", my true love sent to me");
        sixGeeseALaying();
    }

    public static void onePearTree() {
        System.out.println("a partridge in a pear tree.");
        System.out.print("\n");
    }

    public static void twoTurtleDoves() {
        System.out.println("two turtle doves, and");
        onePearTree();
    }

    public static void threeFrenchHens() {
        System.out.println("three French hens,");
        twoTurtleDoves();
    }

    public static void fourCallingBirds() {
        System.out.println("four calling birds,");
        threeFrenchHens();
    }

    public static void fiveGoldenRings() {
        System.out.println("five golden rings,");
        fourCallingBirds();
    }

    public static void sixGeeseALaying() {
        System.out.println("six geese a-laying,");
        fiveGoldenRings();
    }
}