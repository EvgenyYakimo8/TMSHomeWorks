package by.tms.lesson8TasksInLesson7.taskPlus;

/**
 * Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.
 */
public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple("Цукровка!");
        Apple apple1 = cloneApple(apple); // Создание клона

        System.out.println(apple.getName());
        System.out.println(apple1.getName());


    }

    public static Apple cloneApple(Apple apple) { // Реализация клонирования яблони.
        Apple apple1 = null;
        try {
            apple1 = (Apple) apple.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return apple1;
    }
}
