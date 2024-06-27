package by.tms.lesson11.task4;

import java.util.Scanner;

/**
 * Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
 * Если таких слов несколько, найти первое из них.
 */
public class Main {
    protected static String[] str = new String[3];
    protected static String[] slovo;
    protected static String proposal = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }
        System.out.println("Первое слово с неповторяющимися символами -> " + findWord(str));
    }

    protected static String findWord(String[] str) {
        String result = "";
        for (int i = 0; i < str.length; i++) {
            proposal += str[i] + " "; // через пробел соединяю все три строчки в одну
        }
        slovo = proposal.split(" "); // преобразовал в массив отдельных слов

        for (int i = 0; i < slovo.length; i++) { // берем слова поочереди
            int count = 1; //вспомогательная переменная, компенсирует slovo[i].length() - 1
            for (int j = 0; j < slovo[i].length() - 1; j++) {
                if (slovo[i].charAt(j) == slovo[i].charAt(j + 1)) { // используем индекс j каждой буквы charAt(j) конкретного слова slovo[i] и мравниваем со следующей буквой, если они равны - переходим к следующему слову, иначе увеличиваем счетчик на 1
                    break;
                }
                count++;
            }
            if (count == slovo[i].length()) { // если значение счетчика будет равно длинне слова  - значит мы нашли первое слово с не повторяющимися символами!!!
                result = slovo[i];
                break;
            }
        }
        return result;
    }
}