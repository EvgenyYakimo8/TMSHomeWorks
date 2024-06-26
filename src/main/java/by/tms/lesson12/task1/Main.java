package by.tms.lesson12.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Вывести в консоль из строки которую пользователь вводит с клавиатуры все
 * аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
 * только из прописных букв, без чисел.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile("[A-Z]{2,6}");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
