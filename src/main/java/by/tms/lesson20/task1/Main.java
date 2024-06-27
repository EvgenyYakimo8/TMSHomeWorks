package by.tms.lesson20.task1;

import by.tms.lesson20.Functional;

import java.util.Arrays;

/**
 * Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
 * потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
 * вычислений возвращаются в метод main().
 */
public class Main {
    public static void main(String[] args) {
        /*Задаём размер массива с клавиатуры и заполняем случайными значениями от 0 до 10*/
        int[] numbers = Functional.getArrayValue();
        System.out.println("Начальный массив: " + Arrays.toString(numbers));

        OneThread oneThread = new OneThread(numbers);
        TwoThread twoThread = new TwoThread(numbers);
        oneThread.start();
        twoThread.start();
        try {
            oneThread.join();
            twoThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Максимальное число: " + oneThread.getMax());
        System.out.println("Минимальное число: " + twoThread.getMin());

    }
}