// Mac Dang - February 6, 2023
// AP Computer Science A - Mr. Schneider
// lab10
// Janitor Code

public class Janitor extends Employee{

    public Janitor(String status, int hireDate, String name) {
        super(status, hireDate, name);
    }

    public void hardWork() {
        System.out.println("Working for the man");
    }

    public double xMasBonus() {
        return super.xMasBonus() + 25000;
    }

    public String toString() {
        return super.toString() + " and I am a Janitor";
    }
}
