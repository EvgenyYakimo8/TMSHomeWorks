package by.tms.lesson21Calculator.web;

import by.tms.lesson21Calculator.ConsoleApplication;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CalculatorHttpHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String query = exchange.getRequestURI().getQuery();
        Map<String, String> parseQueryMap = parseQuery(query);
        double num1 = Double.parseDouble(parseQueryMap.get("num1"));
        double num2 = Double.parseDouble(parseQueryMap.get("num2"));
        String type = parseQueryMap.get("type");

        ConsoleApplication consoleApplication = new ConsoleApplication();
        double result = consoleApplication.run(num1, num2, type);

        String resultStr = "<h1>Result %s</h1>".formatted(result);
        exchange.sendResponseHeaders(200, resultStr.length());
        exchange.getResponseBody().write(resultStr.getBytes());
        exchange.close();
    }

    private Map<String, String> parseQuery(String query) {
        Map<String, String> result = new HashMap<>();
        String[] split = query.split("&");
        for (String s : split) {
            String[] keyValue = s.split("=");
            result.put(keyValue[0], keyValue[1]);
        }
        return result;
    }
}