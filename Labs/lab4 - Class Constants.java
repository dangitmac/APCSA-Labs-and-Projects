// Mac Dang - September 23, 2022
// lab4
// Mr. Schneider - AP Computer Science A

// updated january 23, 2023

public class lab4 {
    public static void main(String[] args) {

        final int rows = 5;
        final int columns = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("$");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}


