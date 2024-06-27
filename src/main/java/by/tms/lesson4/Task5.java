package by.tms.lesson4;

import java.util.Scanner;

/**
 * Пройти по массиву и поменять местами элементы первый и последний, второй и
 * предпоследний и т.д.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();


        int[] array = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array[i] + "  ");
        }

        System.out.println();

        for (int i = 0; i < sizeArray / 2; i++) {
            int temp = array[i];
            array[i] = array[sizeArray - 1 - i];
            array[sizeArray - 1 - i] = temp;
        }

        System.out.println();

        for (int i = 0; i < sizeArray; i++) {
            System.out.print(array[i] + "  ");
        }


    }
}