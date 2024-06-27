package by.tms.lesson14.task1;

import java.io.*;

public class Analyzer {
    String maxWord = "", minWord = "";

    public StringBuilder reader() {
        File file = new File("src/by.tms.lesson14/task1/romeo-and-juliet.txt");
        StringBuilder stringBuilderReadTheBook = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String tempStr;
            while ((tempStr = bufferedReader.readLine()) != null) {
                stringBuilderReadTheBook.append(tempStr).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilderReadTheBook;
    }

    public void FindTheLongestWord(StringBuilder readBook) {
        int maxWordLength = Integer.MIN_VALUE, minWordLength = Integer.MAX_VALUE;
        String minWordValue = "", maxWordValue = "";
        String tempBook = readBook.toString(); // преобразуем в String для использования удобных методов

        // удаляем все знаки препинания, пробелы в начале строки и двойные пробелы между словами, а так же знаки табуляции.
        tempBook = tempBook.replaceAll("\\p{Punct}", "").replaceAll("\\B[\" \"]{2}\\b", "").replaceAll("((\\b[\" \"]{2}\\b)|(\\t))", " ");

        String[] wordsArray = tempBook.split("[ |\\n]+"); // делим на массив строк (делим по пробелу или по знаку перехода - иначе он добавляет \n к словам)
        for (int i = 0; i < wordsArray.length; i++) {
            if ((wordsArray[i].length() < minWordLength) && (wordsArray[i].length() > 1)) {
                minWordLength = wordsArray[i].length();
                minWordValue = wordsArray[i];
                this.minWord = wordsArray[i];
            }
            if (wordsArray[i].length() > maxWordLength) {
                maxWordLength = wordsArray[i].length();
                maxWordValue = wordsArray[i];
                this.maxWord = wordsArray[i];
            }
        }
        System.out.println("Максимальное слово: " + maxWordValue);
        System.out.println("Минимальное слово: " + minWordValue); // размер более одного символа
    }

    public void WriterToTheLogger(){
        File fileLogger = new File("src/by.tms.lesson14/task1/logger.txt");
        try (FileWriter fileWriter = new FileWriter(fileLogger)){
            fileWriter.write("Максимальное слово: " + this.maxWord + "\n" + "Минимальное слово: " + this.minWord);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
