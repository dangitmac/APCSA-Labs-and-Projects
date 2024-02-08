// Mac Dang - February 27, 2023
// AP Computer Science A - Mr. Schneider
// lab12
// bStudent Class

public class bStudent {

    private String grade;
    private int age;
    private String name;

    public bStudent(String grade, int age, String name) {
        this.grade = grade;
        this.age = age;
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String whatTheme() {
        return "Lion";
    }

    public String whatLot() {
        return "no Lot for you";
    }
}
