package by.tms.lesson15.task3;

import java.util.ArrayList;

/**
 * Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
 * оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
 * Написать метод, который удаляет студентов со средним баллом <3. Если средний
 * балл>=3, студент переводится на следующий курс. Дополнительно написать метод
 * printStudents(List<Student> students, int course), который получает список студентов и
 * номер курса. А также печатает на консоль имена тех студентов из списка, которые
 * обучаются на данном курсе.
 */
public class Main {
    public static void main(String[] args) {
        Functional functional = new Functional();
        ArrayList<Student> studentsList = functional.addStudentsInList();
        System.out.println("Перечень студентов:\n" + studentsList + "\n");
        studentsList = functional.removeStudents(studentsList);
        System.out.println("Перечень студентов после внесения изменений:\n" + studentsList);
        functional.printStudents(studentsList, 3);
    }
}