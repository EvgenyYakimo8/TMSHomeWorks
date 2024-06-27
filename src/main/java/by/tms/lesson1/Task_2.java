package by.tms.lesson1;

/**
 * В переменной n хранится двузначное число. Создайте программу, вычисляющую и
 * выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
 * (2+6).
 */
public class Task_2 {
    public static void main(String[] args) {

        int n = 89;
        int x = n % 10;
        int y = n / 10;
        System.out.println(x + y);

    }
}
