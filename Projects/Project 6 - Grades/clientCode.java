// Mac Dang - January 3, 2023
// Mr. Schneider - AP Computer Science A
// Grades - Project 6
// CLIENT CODE

import java.util.Scanner;

public class clientCode {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = console.next();
        System.out.print("Enter student grade (Freshman, Sophomore, etc.) : ");
        String studentGrade = console.next();

        studentCode student = new studentCode(studentName, studentGrade);

        System.out.print("Enter number of grades to enter: ");
        int numGrades = console.nextInt();

        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter current grade: ");
            double grade = console.nextDouble();
            student.addGrade(grade);
        }

        System.out.print(student);
        System.out.print(" - this student is taking " + student.getNumberOfClasses() + " classes and is ");
        if (student.passingOrFailing()) {
            System.out.println("passing");
        } else {
            System.out.println("failing");
        }
    }
}






