package by.tms.lesson4;

import java.util.Scanner;

/**
 * Найти минимальный-максимальный элементы и вывести в консоль.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;


        int[] array = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
        }


        for (int i = 0; i < sizeArray; i++) {
            System.out.print(array[i] + " ");
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();

        System.out.println("MIN = " + min + ", MAX = " + max);
    }
}
