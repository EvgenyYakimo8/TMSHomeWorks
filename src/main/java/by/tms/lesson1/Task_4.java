package by.tms.lesson1;

/**
 * В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
 * программу, округляющую число n до ближайшего целого и выводящую результат на
 * экран.
 * */
public class Task_4 {
    public static void main(String[] args) {
        double x = 20.5;
        /* или можно так:  x %1 >= 0.5 вместо (x * 10)%10 >= 5*/
        int y = (x * 10)%10 >= 5 ? (int) ++x : (int) x;
        System.out.println(y);
    }
}
