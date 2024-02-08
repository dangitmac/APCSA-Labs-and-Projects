// Mac Dang - February 27, 2023
// AP Computer Science A - Mr. Schneider
// lab12
// bJunior Class

public class bJunior extends bStudent{

    public bJunior(String grade, int age, String name) {
        super(grade, age, name);
    }

    public String whatTheme() {
        return "junior and a " + super.whatTheme();
    }

    public String whatLot() {
        return "B Lot";
    }
}