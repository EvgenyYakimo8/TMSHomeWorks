package by.tms.lesson5;

/**
 * Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
 * Формат входных данных:
 * Программа получает на вход два числа n и m.
 * Формат выходных данных:
 * Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
 * символа.
 * */
public class TaskPlus {
    public static void main(String[] args) {
        int n = 4, m = 6, temp = 0;

        int array[][] = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = temp;
                    temp++;
                }
            } else {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    array[i][j] = temp;
                    temp++;
                }
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}