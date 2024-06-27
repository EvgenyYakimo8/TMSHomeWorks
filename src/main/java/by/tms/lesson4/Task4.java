package by.tms.lesson4;

import java.util.Scanner;

/**
 * Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
 * сообщение, что их нет.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int isNull = 0;


        String[] array = new String[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = ((int) Math.round(Math.random() * 10)) + "";
            if (array[i] == null) {
                isNull++;
            }
        }

        if (isNull == 0) {
            System.out.println("Нет нулевых элементов");
        } else {
            System.out.println("Количество нулевых элементов: " + isNull);
        }


    }
}
