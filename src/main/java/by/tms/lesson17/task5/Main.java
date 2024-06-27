package by.tms.lesson17.task5;

import java.util.function.Supplier;

/**
 * Используя Supplier написать метод, который будет возвращать введенную с консоли
 * строку задом наперед.
 */
public class Main {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            StringBuilder sb = new StringBuilder("Reverse string").reverse();
            return sb.toString();
        };
        System.out.println(supplier.get());
    }
}
