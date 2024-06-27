package by.tms.lesson12.taskPlus;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMetods {
    protected static void findRegexMatches(String line) {
        System.out.println("Поиск совпадений в строке ->\n" + "\t" + line + "\n" + "------------------------------");
        String documentNumberRegex = "\\d{4}-\\d{4}-\\d{2}";
        String phoneRegex = "\\+\\(\\d{2}\\)\\d{7}";
        String emailRegex = "[(A-z|А-я|\\d)]+@[(A-z|А-я|\\d)]+.[(A-z|А-я)]{2,3}";
        String[] regexArray = new String[3];
        regexArray[0] = emailRegex;
        regexArray[1] = phoneRegex;
        regexArray[2] = documentNumberRegex;
        for (int i = 0; i < regexArray.length; i++) {
            Pattern pattern = Pattern.compile(regexArray[i]);
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                if (i == 0) {
                    System.out.println("Email: " + matcher.group());
                } else if (i == 1) {
                    System.out.println("Phone number: " + matcher.group());
                } else if (i == 2) {
                    System.out.println("Document number: " + matcher.group());
                }
            }
        }
        System.out.println("------------------------------");
    }
}