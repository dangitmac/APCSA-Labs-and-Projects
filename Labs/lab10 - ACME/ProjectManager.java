// Mac Dang - February 6, 2023
// AP Computer Science A - Mr. Schneider
// lab10
// ProjectManager Code

public class ProjectManager extends Employee{

    public ProjectManager(String status, int hireDate, String name) {
        super(status, hireDate, name);
    }

    public void trackStatus(String color) {
        System.out.println("Project status - " + color);
    }

    public String toString() {
        return super.toString() + " and I manage projects";
    }

}
