package by.tms.lesson17.task4;

import java.util.function.Consumer;

/**
 * Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
 * формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
 * выводить сумму, переведенную сразу в доллары.
 */
public class Main {
    public static void main(String[] args) {
        String str01 = "1500 BYN";
        System.out.println(str01);
        String[] strArray = str01.split(" ");
        Consumer<String> consumer = string -> System.out.println((Double.parseDouble(string) * 3.28) + " USD");
        consumer.accept(strArray[0]);
    }
}