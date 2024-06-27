package by.tms.lesson17.task2;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Используя Predicate среди массива чисел вывести только те, которые являются
 * положительными.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, -2, 3, -4, 5, -6, 7, -8, 9, -10);

        list = list
                .stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());
        System.out.println(list);

    }
}