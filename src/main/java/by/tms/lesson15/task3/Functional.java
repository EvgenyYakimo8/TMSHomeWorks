package by.tms.lesson15.task3;

import java.util.ArrayList;

public class Functional {
    ArrayList<Student> studentsList = new ArrayList<>();

    public ArrayList<Student> addStudentsInList() {
        this.studentsList.add(new Student("Karl", "K-512", 5, 8));
        this.studentsList.add(new Student("Karlos", "K-513", 4, 2));
        this.studentsList.add(new Student("Karo", "K-514", 3, 2));
        this.studentsList.add(new Student("Karlo", "K-515", 2, 3));
        this.studentsList.add(new Student("Pe", "K-516", 1, 4));
        this.studentsList.add(new Student("Peak", "K-517", 2, 5));
        this.studentsList.add(new Student("Peaker", "K-518", 3, 6));
        this.studentsList.add(new Student("Cooler", "K-519", 5, 1));
        return studentsList;
    }

    public ArrayList<Student> removeStudents(ArrayList<Student> studentsList) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).grades < 3) {
                studentsList.remove(studentsList.get(i));
                if (i != 0) {
                    i -= 1;
                } else {
                    i = 0;
                }
            } else if (studentsList.get(i).grades >= 3) {
                int temp = studentsList.get(i).course;
                studentsList.get(i).setCourse(temp + 1);
            }
        }
        return studentsList;
    }

    public void printStudents(ArrayList<Student> studentsList, int course) {
        ArrayList<Student> printStudents = new ArrayList<>();
        System.out.println("Курс " + course + " , студенты на данном курсе ->");
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).course == course) {
                System.out.println(studentsList.get(i).name);
            }
        }

    }
}