package by.tms.lesson17.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
 * когда пользователю исполнится 100 лет. Использовать Date/Time API.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения (каждое число с новой строки)");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        LocalDate burn = LocalDate.of(year, month, day);
        System.out.println(burn);
        LocalDate burn1 = burn.plusYears(100);
        System.out.println(burn1);
    }
}
