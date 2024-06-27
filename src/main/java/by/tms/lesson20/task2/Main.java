package by.tms.lesson20.task2;

import by.tms.lesson20.Functional;

import java.util.Arrays;

/**
 * Сортировка массива цифр в нескольких потоках различными алгоритмами:
 * - сортировка вставками;
 * - сортировка выбором;
 * - сортировка пузырьком.
 * Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
 * результат отсортированных массивов в консоль.
 */
public class Main {
    public static void main(String[] args) {
        /*Задаём размер массива с клавиатуры и заполняем случайными значениями от 0 до 10*/
        int[] numbers = Functional.getArrayValue();
        System.out.println("Начальный массив: " + Arrays.toString(numbers));
        System.out.println("------------------------------------------------------");

        ThreadBubleSort threadBubleSort = new ThreadBubleSort(numbers);
        ThreadSelectionSort threadSelectionSort = new ThreadSelectionSort(numbers);
        ThreadInsertionSort threadInsertionSort = new ThreadInsertionSort(numbers);
        threadBubleSort.start();
        threadSelectionSort.start();
        threadInsertionSort.start();
        try {
            threadBubleSort.join();
            threadSelectionSort.join();
            threadInsertionSort.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Сортировка пузырьком -> " + Arrays.toString(threadBubleSort.getNumbers()));
        System.out.println("Сортировка выбором -> " + Arrays.toString(threadSelectionSort.getNumbers()));
        System.out.println("Сортировка вставками -> " + Arrays.toString(threadInsertionSort.getNumbers()));
    }
}