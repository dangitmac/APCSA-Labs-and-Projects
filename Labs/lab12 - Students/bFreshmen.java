// Mac Dang - February 27, 2023
// AP Computer Science A - Mr. Schneider
// lab12
// bFreshmen Class

public class bFreshmen extends bStudent{

    public bFreshmen(String grade, int age, String name) {
        super(grade, age, name);
    }

    public String whatTheme() {
        return "frosh and a " + super.whatTheme();
    }
}