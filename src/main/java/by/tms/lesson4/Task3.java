package by.tms.lesson4;

import java.util.Scanner;

/**
 * Найти индексы минимального и максимального элементов и вывести в консоль.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, indexMIN = 0, indexMAX = 0;


        int[] array = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
        }


        for (int i = 0; i < sizeArray; i++) {
            System.out.print(array[i] + " ");
            if (array[i] < min) {
                min = array[i];
                indexMIN = i;
            }
            if (array[i] > max) {
                max = array[i];
                indexMAX = i;
            }
        }
        System.out.println();

        System.out.println("MIN = " + min + ", MAX = " + max);
        System.out.println("indexMIN = " + indexMIN + ", indexMAX = " + indexMAX);
    }
}
