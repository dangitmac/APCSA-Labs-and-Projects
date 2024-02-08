// Mac Dang - October 28, 2022
// Mr. Schneider - AP Computer Science A
// lab7 - Quadrant

// if a point lands outside the grid it returns something
// if a point lands in the grid and is on an axis it returns 0

// i also tried to make it where if a point landed outside of the grid but it was on an axis it would return something,
// utilizing && and || in the same statement but i never figured it out

import java.util.*;

public class lab7 {
    public static void main(String[] args) {

        quadrant();

    }
    public static void quadrant() {

        // asks for coordinates (x, y)
        Scanner console = new Scanner(System.in);

        System.out.println("input an x-coordinate from -100 to 100: ");
        int pointx = console.nextInt();

        System.out.println("input a y-point from -100 to 100:");
        int pointy = console.nextInt();

        // declare variables
        int i = 0;
        int j = 0;

        // Quadrant 1
        if (pointx < -50 && pointx > -100 && pointy > 50 && pointy < 100) {
            i = 1;
            j = 1;
        } else if (pointx < 0 && pointx > -50 && pointy > 50 && pointy < 100) {
            i = 2;
            j = 1;
        } else if (pointx < -50 && pointx > -100 && pointy > 0 && pointy < 50) {
            i = 3;
            j = 1;
        } else if (pointx < 0 && pointx > -50 && pointy > 0 && pointy < 50) {
            i = 4;
            j = 1;

        // Quadrant 2
        } else if (pointx > 0 && pointx < 50 && pointy > 50 && pointy < 100) {
            i = 1;
            j = 2;
        } else if (pointx > 50 && pointx < 100 && pointy > 50 && pointy < 100) {
            i = 2;
            j = 2;
        } else if (pointx > 0 && pointx < 50 && pointy > 0 && pointy < 50) {
            i = 3;
            j = 2;
        } else if (pointx > 50 && pointx < 100 && pointy > 0 && pointy < 50) {
            i = 4;
            j = 2;

        // Quadrant 3
        } else if (pointx < -50 && pointx > -100 && pointy < 0 && pointy > -50) {
            i = 1;
            j = 3;
        } else if (pointx < 0 && pointx > -50 && pointy < 0 && pointy > -50) {
            i = 2;
            j = 3;
        } else if (pointx < -50 && pointx > -100 && pointy < -50 && pointy > -100) {
            i = 3;
            j = 3;
        } else if (pointx < 0 && pointx > -50 && pointy < -50 && pointy > -100) {
            i = 4;
            j = 3;

        // Quadrant 4
        } else if (pointx > 0 && pointx < 50 && pointy < 0 && pointy > -50) {
            i = 1;
            j = 4;
        } else if (pointx > 50 && pointx < 100 && pointy < 0 && pointy > -50) {
            i = 2;
            j = 4;
        } else if (pointx > 0 && pointx < 50 && pointy < -50 && pointy > -100) {
            i = 3;
            j = 4;
        } else if (pointx > 50 && pointx < 100 && pointy < -50 && pointy > -100) {
            i = 4;
            j = 4;

        // if a point lands outside the grid
        } else if (pointx > 100 || pointx < -100 || pointy > 100 || pointy < -100) {
            System.out.print("how dare you not follow my rules");

        // if a point lands on an axis
        } else {
            System.out.println("0");
        }
        if (i == 1) {
            System.out.print("you are in quadrant 1");
        } else if (i == 2) {
            System.out.print("you are in quadrant 2");
        } else if (i == 3) {
            System.out.print("you are in quadrant 3");
        } else if (i == 4) {
            System.out.print("you are in quadrant 4");
        }

        if (j == 1) {
            System.out.println(" of quadrant 1");
        } else if (j == 2) {
            System.out.println(" of quadrant 2");
        } else if (j == 3) {
            System.out.println(" of quadrant 3");
        } else if (j == 4) {
            System.out.println(" of quadrant 4");
        }
    }
}