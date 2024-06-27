package by.tms.lesson11.taskPlus;

/**
 * Дана строка произвольной длины с произвольными словами. Написать программу для
 * проверки является ли любое выбранное слово в строке палиндромом.
 * Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
 * слово в этой строке палиндромом.
 * Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например,
 * в строке 5 слов, а на вход программе передали число 500.
 */
public class Main {
    protected static String randomString = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.";
    boolean isPalendrom = false;

    public static void main(String[] args) {
        System.out.println("Дана начальная строка ->\n \t" + randomString); // показываем строку
        randomString = randomString.replaceAll("\\p{Punct}", ""); //удаляем все знаки препинания (после 12 занятия разобрался как это сделать)
        String[] stringArray = randomString.split(" "); //создаем отдельный массив строк

        System.out.println("\n\tВыберите, какое по счету слово проверить на палиндромность?");
        int numberOfString = InputScanner.scannerStringNumber(stringArray.length - 1); // вводим и обрабатываем число для выбора слова (с защитой от неправильного ввода)
        StringBuilder tempSb = new StringBuilder(stringArray[numberOfString]); // создаем объект StringBuilder для использования метода reverse()
        tempSb.reverse();

        if (stringArray[numberOfString].equalsIgnoreCase(tempSb.toString())) { // сравниваем указанное слово с реверсивным и выводим результат
            System.out.print("Вы выбрали слово Палендром-> " + stringArray[numberOfString]);
        } else System.out.print("Это не палендром -> " + stringArray[numberOfString]);
    }
}