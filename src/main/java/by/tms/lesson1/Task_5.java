package by.tms.lesson1;

/**
 * В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
 * на экран результат деления q на w с остатком. Пример вывода программы (для случая,
 * когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
 */
public class Task_5 {
    public static void main(String[] args) {
        int q = 7, w = 8, ostatok = q % w;
        System.out.println(q + " / " + w + " = " + (q / w) + " и " + ostatok + " в остатке.");
    }
}
