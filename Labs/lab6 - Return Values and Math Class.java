// Mac Dang - October 20, 2022
// Mr. Schneider - AP Computer Science A
// lab6

public class lab6 {
    public static void main(String[] args) {

        int addedNum = result(16, 8);
        System.out.println(addedNum);

        int c = smallestNum(16, 24, 82);
        System.out.println(c);

        double d = smallestAndLargestNum(8, 9, 10);
        System.out.println(d);

    }

    public static int result(int a, int b) {
        return (a + b);

    }

    public static int smallestNum(int x, int y, int z) {
        int calcSmallestNum = Math.min(x, Math.min(y, z));
        return calcSmallestNum;

    }

    public static double smallestAndLargestNum(int x, int y , int z) {
        double calcNum = Math.sqrt(Math.min(x, Math.min(y, z)) + Math.max(x, Math.max(y, z)));
        return calcNum;
    }
}
