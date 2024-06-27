package by.tms.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 * 1.1 Создать двумерный массив, заполнить его случайными числами.
 * 1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
 * 1.3 Найти сумму всех получившихся элементов и вывести в консоль.
 */
public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[5][5];
        System.out.println("Исходный массив ->");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(0, 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Введите число: ");
        int x = scanner.nextInt(), sum = 0;

        System.out.println("Массив результат ->");


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] += x;
                sum += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Сумма все хэлементов = " + sum);


    }
}
