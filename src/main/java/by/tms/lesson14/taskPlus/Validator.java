package by.tms.lesson14.taskPlus;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    String pathToDocuments = "";
    String pathToFalseDocuments = "src/by.tms.lesson14/taskPlus/falseDocumets.txt";
    String pathToTrueDocuments = "src/by.tms.lesson14/taskPlus/trueDocumets.txt";

    public void scan() {
        System.out.println("Введите путь к файлу с номерами документов ->\n");
        Scanner scanner = new Scanner(System.in);
        this.pathToDocuments = scanner.nextLine();
        scanner.close();
    }

    public StringBuilder reader() {
        StringBuilder bufferDocuments = new StringBuilder();
        String tempStr;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.pathToDocuments))) {
            while ((tempStr = bufferedReader.readLine()) != null) {
                bufferDocuments.append(tempStr).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return bufferDocuments;
    }

    public void validation(StringBuilder bufferDocuments) {
        ArrayList<String> trueArrayList = new ArrayList<>(); // Временное хранилище правильных номеров
        ArrayList<String> falseArrayList = new ArrayList<>(); // Временное хранилище не правильных номеров
        String[] bufferStrArray = bufferDocuments.toString().split("\n"); // Преобразуем в массив строк наш буфер
        ArrayList<String> bufferArrayList = new ArrayList<>(Arrays.asList(bufferStrArray)); // Преобразуем в лист строк

        /*Константы, Паттерны и Матчеры*/
        final String PATTERN_WORD = "^(contract|docnum).+";
        final String PATTERN_LENGHT = "^\\w{15}$";
        final String PATTERN_ELSE = "^(\\w{1,14}|\\w{16,50})$";
        final String PATTERN_WORD_AND_LENGHT = "^(contract|docnum)\\w{7,9}$";
        Pattern patternSlovoAndLenght = Pattern.compile(PATTERN_WORD_AND_LENGHT, Pattern.MULTILINE);
        Matcher matcherSlovoAndLenght = patternSlovoAndLenght.matcher(bufferDocuments);

        /*Записываем во временное хранилище правильные номера*/
        while (matcherSlovoAndLenght.find()) {
            trueArrayList.add(matcherSlovoAndLenght.group());
        }

        /*удаляем из листа буфера строк строки с правильными номерами (что-бы не мешались)
         * Если не удалено - то записывается в лист с неправильными номерами с проверкой на причину и
         * добавлением туда комментария*/
        for (int i = 0; i < bufferArrayList.size(); i++) {
            for (int j = 0; j < trueArrayList.size(); j++) {
                if (bufferArrayList.get(i).equals(trueArrayList.get(j))) {
                    bufferArrayList.remove(bufferArrayList.get(i));
                }
            }
            if (bufferArrayList.get(i).matches(PATTERN_WORD)) {
                falseArrayList.add(bufferArrayList.get(i) + "   ->   Не верная длинна имени документа, номер должен состоять из 15 символов!");
            } else if (bufferArrayList.get(i).matches(PATTERN_LENGHT)) {
                falseArrayList.add(bufferArrayList.get(i) + " -> В начале имени документа должно стоять contract или docnum");
            } else if (bufferArrayList.get(i).matches(PATTERN_ELSE)) {
                falseArrayList.add(bufferArrayList.get(i) + "   ->   В начале имени документа должно стоять contract или docnum, также номер должен состоять из 15 символов!");
            }
        }

        /*запись документов, прошедших и не прошедших валидацию в файлы falseDocuments и trueDocuments*/
        try (BufferedWriter bufferedFalseWriter = new BufferedWriter(new FileWriter(pathToFalseDocuments));
             BufferedWriter bufferedTrueWriter = new BufferedWriter(new FileWriter(pathToTrueDocuments))) {
            for (String e : trueArrayList) {
                bufferedTrueWriter.write(e + "\n");
            }
            for (String e : falseArrayList) {
                bufferedFalseWriter.write(e + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}