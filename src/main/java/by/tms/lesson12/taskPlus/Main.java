package by.tms.lesson12.taskPlus;

import java.util.Scanner;

/**
 * Программа на вход получает произвольный текст. В этом тексте может быть номер
 * документа(один или несколько), емейл и номер телефона. Номер документа в формате:
 * xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
 * может содержать не всю информацию, т.е. например, может не содержать номер
 * телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
 * формате:
 * email: teachmeskills@gmail.com
 * document number: 1423-1512-51
 * и т.д
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        //line = scanner.nextLine(); //для ввода своей строки раскомментируйте эту строку и закомментируйте строчку ниже.
        line = "document # 1423-1512-51 finder of the police and sent to email address -> colos0117@gmail.com if you need to speak to me? call to my phone +(33)3338885"; // демонстрационная строчка с белибердой на скорую руку
        RegexMetods.findRegexMatches(line);
    }
}