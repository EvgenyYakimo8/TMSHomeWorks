package by.tms.lesson11.task5;

import java.util.Scanner;
/**
 * Вывести на консоль новую строку, которой задублирована каждая буква из
 * начальной строки. Например, "Hello" -> "HHeelllloo".
 * */
// программа работает только с первым словом, если понадобится поменять второе или третье например - не заработает.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder strB = new StringBuilder(scanner.nextLine()); // занес строку в StringBuilder
        String[] str = (strB.toString()).split(" "); // преобразовал в массив отдельных слов

        for (int i = 0; i < 1; i++) {
            char[] charArray = str[i].toCharArray(); // беру отдельное слово и разбиваю его на массив символов
            int doubleCount = 0; // вспомогательный счетчик для индекса установки второй буквы

            for (int j = 0; j < charArray.length; j++) { // иду по каждому символу и спомощью счетчика doubleCount вставляю символ из слова массива символов charArray в нужную позицию строки StringBuilder (первого слова)
                strB.insert(doubleCount + 1, charArray[j]);
                doubleCount += 2;
            }
        }
        System.out.println(strB);
    }
}