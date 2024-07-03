package by.tms.lesson21Calculator.web;

import by.tms.lesson21Calculator.model.Operation;
import by.tms.lesson21Calculator.service.OperationService;
import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CalculatorHttpHandler implements HttpHandler {

    private final OperationService operationService = new OperationService();

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String query = exchange.getRequestURI().getQuery();
        Map<String, String> parseQueryMap = parseQuery(query);
        double num1 = Double.parseDouble(parseQueryMap.get("num1"));
        double num2 = Double.parseDouble(parseQueryMap.get("num2"));
        String type = parseQueryMap.get("type");

        Operation operation = new Operation(num1, num2, type);
        Operation execute = operationService.executeOperation(operation);

        Gson gson = new Gson();
        String json = gson.toJson(execute);

        exchange.sendResponseHeaders(200, json.length());
        exchange.getResponseBody().write(json.getBytes());
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