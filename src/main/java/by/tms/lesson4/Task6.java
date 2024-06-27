package by.tms.lesson4;

import java.util.Scanner;

/**
 * Проверить, является ли массив возрастающей последовательностью (каждое следующее
 * число больше предыдущего).
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int count = 0;


        int[] array = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
        }


        for (int i = 0; i < sizeArray - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;
            }
        }
        if (count == sizeArray) {
            System.out.println("Последовательность возрастающая");
        } else {
            System.out.println("Последовательность не возрастающая");
        }

    }
}