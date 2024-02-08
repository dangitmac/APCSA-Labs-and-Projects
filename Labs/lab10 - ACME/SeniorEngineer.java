// Mac Dang - February 6, 2023
// AP Computer Science A - Mr. Schneider
// lab10
// SeniorEngineer Code

public class SeniorEngineer extends Engineer {

    private double adjust;

    public SeniorEngineer(String status, int hireDate, String name, int level, double adjust) {
        super(status, hireDate, name, level);
        this.adjust = adjust;
    }

    public double getSalary() {
        return super.getSalary() + this.adjust;
    }

    public void herdCats(String task) {
        System.out.println("Engineering - " + task);
    }

    public String toString() {
        return super.toString() + " -(Senior)";
    }
}
