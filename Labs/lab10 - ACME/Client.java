// Mac Dang - February 6, 2023
// AP Computer Science A - Mr. Schneider
// lab10
// Client Code

public class Client {
    public static void main(String[] args) {

        ProjectManager myP = new ProjectManager("Full Time", 2010, "Peter Project");
        Engineer myE1 = new Engineer("Full Time", 2015, "Eva Engineer", 1);
        Engineer myE2 = new Engineer("Part Time", 2015, "Eric Engineer", 2);
        SeniorEngineer myS = new SeniorEngineer("Full Time", 2017, "Sally Senior", 3, 10000);
        Janitor myJ = new Janitor("Part Time", 2000, "Jimmy Janitor");

        System.out.println();
        // Project Manager
        System.out.println("Name - " + myP.getName());
        System.out.println("Status - " + myP.getStatus());
        System.out.println("Hire Date - " + myP.getHireDate());
        System.out.println("Hours - " + myP.getHours());
        System.out.println("Salary - $" + myP.getSalary());
        System.out.println("Vacation Days - " + myP.getVacationDays());
        System.out.println("Christmas Bonus - $" + myP.xMasBonus());
        myP.trackStatus("Red");
        System.out.println(myP);

        System.out.println();
        // Engineer 1
        System.out.println("Name - " + myE1.getName());
        System.out.println("Status - " + myE1.getStatus());
        System.out.println("Level - " + myE1.getLevel());
        System.out.println("Hire Date - " + myE1.getHireDate());
        System.out.println("Hours - " + myE1.getHours());
        System.out.println("Salary - $" + myE1.getSalary());
        System.out.println("Vacation Days - " + myE1.getVacationDays());
        System.out.println("Christmas Bonus - $" + myE1.xMasBonus());
        myE1.testCode("Pass");
        System.out.println(myE1);

        System.out.println();
        // Engineer 2
        System.out.println("Name - " + myE2.getName());
        System.out.println("Status - " + myE2.getStatus());
        System.out.println("Level - " + myE2.getLevel());
        System.out.println("Hire Date - " + myE2.getHireDate());
        System.out.println("Hours - " + myE2.getHours());
        System.out.println("Salary - $" + myE2.getSalary());
        System.out.println("Vacation Days - " + myE2.getVacationDays());
        System.out.println("Christmas Bonus - $" + myE2.xMasBonus());
        myE1.testCode("Fail");
        System.out.println(myE2);

        System.out.println();
        // Senior Engineer
        System.out.println("Name - " + myS.getName());
        System.out.println("Status - " + myS.getStatus());
        System.out.println("Level - " + myS.getLevel());
        System.out.println("Hire Date - " + myS.getHireDate());
        System.out.println("Hours - " + myS.getHours());
        System.out.println("Salary - $" + myS.getSalary());
        System.out.println("Vacation Days - " + myS.getVacationDays());
        System.out.println("Christmas Bonus - $" + myS.xMasBonus());
        myS.herdCats("On Task");
        System.out.println(myS);

        System.out.println();
        // Janitor
        System.out.println("Name - " + myJ.getName());
        System.out.println("Status - " + myJ.getStatus());
        System.out.println("Hire Date - " + myJ.getHireDate());
        System.out.println("Hours - " + myJ.getHours());
        System.out.println("Salary - $" + myJ.getSalary());
        System.out.println("Vacation Days - " + myJ.getVacationDays());
        System.out.println("Christmas Bonus - $" + myJ.xMasBonus());
        myJ.hardWork();
        System.out.println(myJ);
    }
}
