package by.tms.lesson21Calculator.web;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class CalculatorHttpServer {
    public void go() {
        try {
            HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), 0);
            httpServer.createContext("/calc", new CalculatorHttpHandler());
            httpServer.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
