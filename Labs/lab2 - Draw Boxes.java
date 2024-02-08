// Mac Dang - September 9, 2022
// Mr. Schneider - AP Computer Science A
// lab2

public class lab2 {
    public static void main(String[] args) {
        System.out.println("box draw start");
        drawBox();
        drawBox();
        drawBox();
        System.out.println("box draw end");

    }

    public static void drawBox() {

        topBox();
        sideBox();
        sideBox();
        topBox();

    }

    public static void topBox() {
        System.out.println("+-----+");

    }

    public static void sideBox () {
        System.out.println("|-----|");
    }
}
