// Mac Dang - February 27, 2023
// AP Computer Science A - Mr. Schneider
// lab12
// bSenior Class

public class bSenior extends bStudent{

    public bSenior(String grade, int age, String name) {
        super(grade, age, name);
    }

    public String whatTheme() {
        return "senior and a " + super.whatTheme();
    }

    public String whatLot() {
        return "C Lot";
    }
}