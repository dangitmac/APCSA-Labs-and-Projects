// Mac Dang - January 3, 2023
// Mr. Schneider - AP Computer Science A
// Grades - Project 6
// CLASS CODE

import java.util.*;

public class studentCode {
    private String studentName;
    private String studentGrade;
    private ArrayList<Double> grades;

    public studentCode(String name, String grade) {
        studentName = name;
        studentGrade = grade;
        grades = new ArrayList<Double>();
    }

    public boolean passingOrFailing() {
        double sum = 0;

        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        double average = sum / grades.size();
        return average >= 65;
    }

    public int getNumberOfClasses() {
        return grades.size();
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public String toString() {
        return studentName + " is a " + studentGrade;
    }
}

