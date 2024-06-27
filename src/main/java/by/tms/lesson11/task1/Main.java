package by.tms.lesson11.task1;

import java.util.Scanner;

/**
 * Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
 * найденные строки и их длину.
 */
public class Main {

    protected static String[] str = new String[3];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }
        minMaxStr(str[0].length(), str[1].length(), str[2].length());
    }

    protected static void minMaxStr(int lenght1, int lenght2, int lenght3) {
        int maxLenght = Math.max((Math.max(lenght1, lenght2)), lenght3);
        int minLenght = Math.min((Math.min(lenght1, lenght2)), lenght3);

        String strMax = "", strMin = "";

        if (maxLenght == lenght1) {
            strMax = str[0];
        } else if (maxLenght == lenght2) {
            strMax = str[1];
        } else if (maxLenght == lenght3) {
            strMax = str[2];
        }

        if (minLenght == lenght1) {
            strMin = str[0];
        } else if (minLenght == lenght2) {
            strMin = str[1];
        } else if (minLenght == lenght3) {
            strMin = str[2];
        }

        System.out.println("Самая длинная строка = " + strMax + " ,её длинна: " + maxLenght);
        System.out.println("Самая короткая строка = " + strMin + " ,её длинна: " + minLenght);
    }
}
