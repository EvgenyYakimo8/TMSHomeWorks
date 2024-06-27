package by.tms.lesson20;

import java.util.Random;
import java.util.Scanner;

public class Functional {
    /*Задаём размер массива с клавиатуры и заполняем случайными значениями от 0 до 10*/
    public static int[] getArrayValue() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sizeArray = scanner.nextInt();
        int[] tempArray = new int[sizeArray];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = random.nextInt(10);
        }
        return tempArray;
    }
}
