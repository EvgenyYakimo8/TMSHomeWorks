package by.tms.lesson15.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
 * 4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
 * При решении использовать коллекции.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tempStr = scanner.nextLine().split("( |,)"); // считываем со сканера строку и записываем слова в массив
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(tempStr));

        /*Integer[] intArray = new Integer[tempStr.length]; // это код с преобразованием в Integer, если вместо String нам потребуется int
        for (int i = 0; i < tempStr.length; i++) {
            intArray[i] = Integer.parseInt(tempStr[i]);
        }
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(intArray));*/

        System.out.println("\n\n" + "До: " + arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    arrayList.remove(arrayList.get(j));
                    j = j - 1;
                }
            }
        }
        System.out.println("После:" + arrayList);
    }
}