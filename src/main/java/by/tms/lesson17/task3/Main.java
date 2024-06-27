package by.tms.lesson17.task3;


import java.util.function.Function;

/**
 * Используя Function реализовать лямбду, которая будет принимать в себя строку в
 * формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
 * возвращать сумму, переведенную сразу в доллары.
 */
public class Main {
    public static void main(String[] args) {
        String str = "1000 BYN";
        System.out.println(str);
        String[] strArray = str.split(" ");
        Function<String, Double> function = string -> Double.parseDouble(string) * 3.28;
        System.out.println(function.apply(strArray[0]) + " USD");
    }
}
