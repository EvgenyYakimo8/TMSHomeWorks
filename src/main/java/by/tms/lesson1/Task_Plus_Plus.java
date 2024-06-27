package by.tms.lesson1;

/**
 * Написать программу которая будет менять местами значение целочисленных
 * переменных. Пример:
 * int a = 1; int b = 2;
 * //код (ваше решение)
 * sout(a); //выведет 2
 * sout(b); //выведет 1
 * Усовершенствовать программу, использовать только 2 входные переменные (a,b);
 */
public class Task_Plus_Plus {
    public static void main(String[] args) {
        int a = 1, b = 2;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
