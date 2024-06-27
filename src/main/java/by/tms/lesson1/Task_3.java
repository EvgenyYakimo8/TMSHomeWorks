package by.tms.lesson1;

/**
 * В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
 * выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
 * 9 (1+2+6).
 */
public class Task_3 {
    public static void main(String[] args) {
        int n = 789;
        int x = n % 10;
        int y = (n / 10) % 10;
        int z = n / 100;
        System.out.println(x + y + z);


    }
}
