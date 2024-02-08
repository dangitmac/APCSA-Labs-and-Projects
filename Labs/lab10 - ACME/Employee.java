// Mac Dang - February 6, 2023
// AP Computer Science A - Mr. Schneider
// lab10
// Employee Code


public class Employee {

    private String status;
    private int hireDate;
    private double salary;
    private int hours = 40;
    private String name;

    public Employee(String status, int hireDate, String name) {
        this.status = status;
        this.hireDate = hireDate;
        this.name = name;

        if (status.equalsIgnoreCase("Full Time")) {
            this.salary = 70000;
        }

        else if (status.equalsIgnoreCase("Part Time")) {
            this.salary = 40000;
            this.hours = 20;
        }
    }

    public String getStatus() {
        return status;
    }

    public int getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public int getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public int getVacationDays() {
        double yearsWorked = 2023 - this.hireDate;
        return (int) yearsWorked * 2;
    }

    public double xMasBonus() {
        double yearsWorked = 2023 - this.hireDate;
        double computedBonus = (this.salary * 0.10); // 10%
        return yearsWorked * computedBonus;
    }

    public String toString() {
        return "I work " + this.status + " for ACME\nComputing";
    }

}
