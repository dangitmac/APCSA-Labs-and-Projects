// Mac Dang - February 6, 2023
// AP Computer Science A - Mr. Schneider
// lab10
// Engineer Code

public class Engineer extends Employee{

    private int level;

    public Engineer(String status, int hireDate, String name, int level) {
        super(status, hireDate, name);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public double getSalary() {
        double currentSalary = super.getSalary();

        if (this.level == 1) {
            currentSalary += 10000;
        } else if (this.level == 2) {
            currentSalary += 30000;
        } else if (this.level == 3) {
            currentSalary += 50000;
        }

        return currentSalary;
    }

    public void testCode(String result) {
        System.out.println("Code - " + result);
    }

    public String toString() {
        return super.toString() + " and I am an Engineer";
    }
}
