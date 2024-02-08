// Mac Dang - February 27, 2023
// AP Computer Science A - Mr. Schneider
// lab12
// bSophomore Class

public class bSophomore extends bStudent {

    public bSophomore(String grade, int age, String name) {
        super(grade, age, name);
    }

    public String whatTheme() {
        return "soph and a " + super.whatTheme();
    }

    public String whatLot() {

        if (this.getAge() == 16) {
            return "A Lot";
        } else {
            return super.whatLot();
        }
    }
}
