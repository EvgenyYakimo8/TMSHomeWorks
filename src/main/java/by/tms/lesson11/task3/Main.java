package by.tms.lesson11.task3;

import java.util.Scanner;

/**
 * Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
 * средней, а также их длину.
 */
public class Main {
    protected static String[] str = new String[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }
        outString();
    }

    protected static void outString() {
        int averageNumber = 0, temp = 0;
        for (int i = 0; i < str.length; i++) {
            temp += str[i].length();
        }
        averageNumber = temp / str.length;

        System.out.println("Строки, длинна которых меньше -> " + averageNumber + " (средняя длинна)");

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < averageNumber) {
                System.out.println(str[i] + " с длинной: " + str[i].length() + " символов.");
            }
        }
    }
}