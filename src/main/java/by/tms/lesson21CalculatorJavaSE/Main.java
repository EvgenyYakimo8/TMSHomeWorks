package by.tms.lesson21CalculatorJavaSE;

import by.tms.lesson21CalculatorJavaSE.web.WebAplication;

/**
 * Пример для запроса в браузере ->
 * localhost:8080/calc?num1=29&num2=29&type=sum
 */

public class Main {
    public static void main(String[] args) {
        Application application = new WebAplication();
        application.run();
    }
}