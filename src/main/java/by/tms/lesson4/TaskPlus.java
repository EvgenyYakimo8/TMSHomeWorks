package by.tms.lesson4;

import java.util.Scanner;

/**
 * Имеется массив из неотрицательных чисел(любой). Представьте что массив
 * представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
 * добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
 * содержит нуля в начале, кроме самого числа 0.
 * Пример:
 * Input: [1,4,0,5,6,3]
 * Output: [1,4,0,5,6,4]
 * Input: [9,9,9]
 * Output: [1,0,0,0]
 */
public class TaskPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        boolean isTrue = false;

        int[] array = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = sizeArray - 1; i >= 0; i--) {
            if (array[i] != 9) {
                array[i] += 1;
                isTrue = true;
                break;
            }
            if (!isTrue) {
                sizeArray += 1;
                array = new int[sizeArray];
                array[0] = 1;
                break;
            }
        }

        for (int i = 0; i < sizeArray; i++) {
            System.out.print(array[i] + "  ");
        }


    }
}