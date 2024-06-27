package by.tms.lesson11.task2;

import java.util.Scanner;

/**
 * Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
 * значений их длины.
 */
public class Main {

    protected static String[] str = new String[3];

    protected static String tempString;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }
        sort();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }

    protected static void sort() {
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i].length() > str[i + 1].length()) {
                tempString = str[i];
                str[i] = str[i + 1];
                str[i + 1] = tempString;
            }
        }
    }
}
