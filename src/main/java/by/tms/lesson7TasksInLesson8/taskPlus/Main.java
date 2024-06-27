package by.tms.lesson7TasksInLesson8.taskPlus;

import java.lang.reflect.Field;

/**
 * Создать класс Apple и добавить в него поле color с модификатором доступа private и
 * инициализировать его. В методе main другого класса создать объект Apple, и не
 * используя сеттеры изменить значение поля color.
 */
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();


        Class cls = apple.getClass();
        System.out.println(cls.getName() + " -> Имя класса.");
        System.out.println("-------------------------------------------------------------------------------------------");

        Field[] publicFields = cls.getFields();
        for (Field f : publicFields) {
            System.out.println(f + " -> Имена публичных полей класса.");
        }
        System.out.println("-------------------------------------------------------------------------------------------");

        Field[] allFields = cls.getDeclaredFields();
        for (Field f : allFields) {
            System.out.println(f + " -> Имена всех полей класса.");
        }
        System.out.println("-------------------------------------------------------------------------------------------");
        try {
            Field colorField = cls.getDeclaredField("color");
            colorField.setAccessible(true);
            System.out.println("В приватном поле Color сохранено -> " + colorField.get(apple));
            System.out.println("Меняем приватное поле color класса Apple... с помощью рефлексии (Тёмная сторона Java !!!)");
            System.out.println();
            colorField.set(apple, "Red");
            System.out.println("Теперь в приватном поле Color сохранено -> " + colorField.get(apple));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
