package by.tms.lesson21Calculator;

import by.tms.lesson21Calculator.web.CalculatorHttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Пример для запроса в аддрессной строке браузера ->
 * localhost:8080/calc?num1=29&num2=29&type=sum
 * */

public class Main {
    public static void main(String[] args) {
        try {
            HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), 0);
            httpServer.createContext("/calc", new CalculatorHttpHandler());
            httpServer.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}