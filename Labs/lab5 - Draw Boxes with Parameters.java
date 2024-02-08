// Mac Dang - October 14, 2022
// Mr. Schneider - AP Computer Science A
// lab5

public class lab5 {
    public static void main(String[] args) {
        char ch;
        drawBox(10, 6, 'X');
        drawBox(4, 3, '#');
        drawBox(6, 4, 'O');

    }

    public static void drawBox(int height, int width, char ch) {
        for(int a = 1; a <= height; a++) {
            for(int b = 1; b <= width; b++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

