package by.tms.lesson11.taskPlus;

import java.util.Scanner;

public class InputScanner {
    protected static Scanner scanner = new Scanner(System.in);

    protected static int scannerStringNumber(int countOfWords) {
        boolean flag = false;
        int number = 0;
        System.out.println("Диапазон ввода: от " + number + " до " + countOfWords);
        while (!flag) {
            number = scanner.nextInt();
            if (number > countOfWords || number < 0) {
                System.out.println("Слово c таким номером не существует, повторите ввод... ->");
                flag = false;
            } else {
                flag = true;
            }
        }
        return number;
    }
}