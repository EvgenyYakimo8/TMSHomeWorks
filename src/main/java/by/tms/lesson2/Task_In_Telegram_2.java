package by.tms.lesson2;

/**
 * Фибоначчи
 * */

public class Task_In_Telegram_2 {
    public static void main(String[] args) {
        int fib_1 = 1, fib_2 = 1, result = 0;

        System.out.print(fib_1 + " " + fib_2 + " ");

        for (int i = 0; i < 11; i++) {
            result = fib_1 + fib_2;
            fib_1 = fib_2;
            fib_2 = result;
            System.out.print(result + " ");
        }
    }
}
