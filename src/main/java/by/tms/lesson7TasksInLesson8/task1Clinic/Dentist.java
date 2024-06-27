package by.tms.lesson7TasksInLesson8.task1Clinic;

public class Dentist extends Doctor {
    @Override
    protected void heal() {
        System.out.println("Дантист похилил! Зубы вставлены!");
    }
}
