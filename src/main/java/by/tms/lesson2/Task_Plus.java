package by.tms.lesson2;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А
 * программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
 * числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
 * ввести некорректные данные.
 */
public class Task_Plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положитльное число -> ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 0) {
                int result = 0;
                for (int i = 1; i <= number; i++) {
                    result += i;
                }
                System.out.println("Сумма всех чисел до введенного числа = " + result);
            } else System.out.println("Необходимо ввести ПОЛОЖИТЕЛЬНОЕ число!");
        } else System.out.println("Это не число...");
    }
}
