// Mac Dang - December 27, 2022
// Mr. Schneider - AP Computer Science A
// airplane - lab9

import java.util.*;

public class lab9 {
    public static void main(String[] args) {

        Plane plane1 = new Plane("737", "SEAORD", 1716, 167);
        System.out.println(plane1.allPlaneInfo());

        Plane plane2 = new Plane("747", "SEAMCO", 2554, 622);
        System.out.println(plane2.allPlaneInfo());

    }
    public static class Plane {
        private String model;
        private String cityPair;
        private int miles;
        private int seats;

        Plane(String model, String cityPair, int miles, int seats) {
            this.model = model;
            this.cityPair = cityPair;
            this.miles = miles;
            this.seats = seats;
        }
    public int asm() {
        return miles * seats;
    }

    public String allPlaneInfo() {
        return "The " + model + " flying between " + cityPair + " has " + asm() + " available seat miles.";
        }
    }
}
