package by.tms.lesson18.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
 * Stream'ов:
 * - Удалить дубликаты
 * - Оставить только четные элементы
 * - Вывести сумму оставшихся элементов в стриме
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 8, 8, 9, 10, 10, 10);
        Optional<Integer> listOptional = list.stream().distinct().filter(num -> num % 2 == 0).reduce(Integer::sum);
        System.out.println(listOptional);
    }
}
