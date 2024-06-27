package by.tms.lesson2;

/**
 * Необходимо, чтоб программа выводила на экран вот такую последовательность:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
 */
public class Task_4 {
    public static void main(String[] args) {
        int number = 0;
        while (number < 98) {
            number += 7;
            System.out.print(number + " ");
        }
    }
}