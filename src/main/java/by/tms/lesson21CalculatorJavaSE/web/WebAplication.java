package by.tms.lesson21CalculatorJavaSE.web;

import by.tms.lesson21CalculatorJavaSE.Application;
import by.tms.lesson21CalculatorJavaSE.web.handler.OperationHttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class WebAplication implements Application {
    @Override
    public void run() {
        try {
            HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), 0);
            httpServer.createContext("/calc", new OperationHttpHandler());
            httpServer.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}