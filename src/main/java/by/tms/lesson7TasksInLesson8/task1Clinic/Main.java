package by.tms.lesson7TasksInLesson8.task1Clinic;

import java.util.Scanner;

/**
 * Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
 * хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
 * по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
 * «Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
 * терапевта создать метод, который будет назначать врача пациенту согласно плану
 * лечения:
 * Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
 * Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
 * Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
 * лечить.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите план лечения (1, 2, 3 или иной)");
        int scan = scanner.nextInt();
        Patient patient = new Patient(scan);

        Therapist therapist = new Therapist();

        Doctor doctor = therapist.appointDoctor(patient.getPlanToHeal());
        doctor.heal();

    }
}
