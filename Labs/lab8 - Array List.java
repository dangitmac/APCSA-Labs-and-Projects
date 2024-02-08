// Mac Dang - December 27, 2022
// Mr. Schneider - AP Computer Science A
// arrayList - lab8

import java.util.*;

public class lab8 {
    public static void main(String[] args) {
        ArrayList<String> classRoom = new ArrayList<String>();

        populateRows(classRoom);

        for(int i = 0; i < classRoom.size(); i++){
            System.out.println(classRoom.get(i));
        }

        for (int i = 0; i < classRoom.size(); i++) {
            String student = classRoom.get(i);
            System.out.println(student);
        }
    }

    public static void populateRows(ArrayList<String> classRoom) {
        ArrayList<String> row1 = new ArrayList<String>();
        row1.add("Student1");
        row1.add("Student2");
        row1.add("Student3");

        ArrayList<String> row2 = new ArrayList<String>();
        row2.add("Student4");
        row2.add("Student5");
        row2.add("Student6");

        ArrayList<String> row3 = new ArrayList<String>();
        row3.add("Student7");
        row3.add("Student8");
        row3.add("Student9");

        classRoom.addAll(row1);
        classRoom.addAll(row2);
        classRoom.addAll(row3);
    }

    public static ArrayList<String> oneList(ArrayList<String> classRoom) {
        ArrayList<String> newList = new ArrayList<String>();
        newList = oneList(classRoom);
        newList.addAll(classRoom);
        return newList;
    }
}