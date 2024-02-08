// Mac Dang - February 27, 2023
// AP Computer Science A - Mr. Schneider
// lab12
// Client Code

public class ClientCodeLab12 {
    public static void main(String[] args) {
        bStudent[] bStudents = new bStudent[5];

        // bFreshmen - Sally Smith that is 14
        bFreshmen bFreshmen = new bFreshmen("Freshman", 14, "Sally Smith");

        // bSophomore - Billy Bean that is 15
        bSophomore bSophomore1 = new bSophomore("Sophomore", 15, "Billy Bean");

        // bSophomore - Trent Trenter that is 16
        bSophomore bSophomore2 = new bSophomore("Sophomore", 16, "Trent Trenter");

        // bJunior - Betty Better that is 17
        bJunior bJunior = new bJunior("Junior", 17, "Betty Better");

        // bSenior - Kimmy Krumble that is 14
        bSenior bSenior = new bSenior("Senior", 18, "Kimmy Krumble");

        bStudents[0] = bFreshmen;
        bStudents[1] = bSophomore1;
        bStudents[2] = bSophomore2;
        bStudents[3] = bJunior;
        bStudents[4] = bSenior;

        for (int index = 0; index < bStudents.length; index++) {
            bStudent student = bStudents[index];
            System.out.println("My name is " + student.getName() + " and I am a " + student.getAge() + " year old " + student.getGrade() + " and");
            System.out.println("I park in the " + student.whatLot());
            System.out.println("I am a " + student.whatTheme() + " during home coming week");
            System.out.println();
        }
    }
}
