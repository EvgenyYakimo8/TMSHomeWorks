package by.tms.lesson21Calculator;

import by.tms.lesson21Calculator.web.CalculatorHttpServer;


/**
 * Пример для запроса в аддрессной строке браузера ->
 * localhost:8080/calc?num1=29&num2=29&type=sum
 * */

public class Main {
    public static void main(String[] args) {
        CalculatorHttpServer calculatorHttpServer = new CalculatorHttpServer();
        calculatorHttpServer.go();
    }
}