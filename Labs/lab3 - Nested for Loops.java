// Mac Dang - September 28, 2022
// lab3
// Mr. Schneider - AP Computer Science A

public class lab3a {
    public static void main(String[] args) {
        for (int a = 1; a < 5; a++) {
            for (int a1 = 0; a1 < 5; a1++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int b = 1; b < 4; b++) {
            for (int b1 = 0; b1 < 11; b1++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
