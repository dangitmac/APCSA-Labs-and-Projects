// Mac Dang - October 6, 2022
// Mr. Schneider - AP Computer Science A
// drawRocket - Project 2

public class drawRocket {
    public static final int size = 3; //this is the variable that controls the size of everything
    public static void main(String[] args) {
        drawCone();
        drawDivider();
        drawUp();
        drawDown();
        drawDivider();
        drawDown();
        drawUp();
        drawDivider();
        drawCone();
    }
    public static void drawCone() {
        /**
         *       /**\
         *      //**\\
         *     ///**\\\
         *    ////**\\\\        :)
         *  /////**\\\\\
         *  */
        for (int line = 1; line <= (size*2-1); line++) {
            for (int space = 1; space <= (size*2-1)-line; space++) {
                System.out.print(" ");
            }
            for (int fslash = 1; fslash <= line; fslash++) {
                System.out.print("/");
            }
            System.out.print("**");

            for (int bslash = 1; bslash <= line; bslash++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }
    public static void drawUp() {
        /**
         * |../\..../\..|
         * |./\/\../\/\.|
         * |/\/\/\/\/\/\|
         * this part took me way too long and i still don't exactly understand it :/
         */
        for (int line = 1; line <= size; line++) {
            System.out.print("|");
            for (int rep = 1; rep <=2; rep++) {
                for (int per = 1; per <= size - line; per++) {
                    System.out.print(".");
                }
                for (int fabslash = 1; fabslash <= line; fabslash++) {
                    System.out.print("/\\");
                }
                for (int per = 1; per <= size - line; per++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }
    public static void drawDown() {
        /**
         * |\/\/\/\/\/\/|
         * |.\/\/..\/\/.|
         * |..\/....\/..|
         */

        for (int line = size; line >= 1; line--) {
            System.out.print("|");
            for (int rep = 1; rep <= 2; rep++) {
                for (int per = 1; per <= size - line; per++) {
                    System.out.print(".");
                }
                for (int fabslash = 1; fabslash <= line; fabslash++) {
                    System.out.print("\\/");
                }
                for (int per = 1; per <= size - line; per++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }
    public static void drawDivider() {
        /**
         * +=*=*=*=*=*=*+
         */
        System.out.print("+");
        for (int metamodernity = 1; metamodernity <= size * 2; metamodernity++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }
}