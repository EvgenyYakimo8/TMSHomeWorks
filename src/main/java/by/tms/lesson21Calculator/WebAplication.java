package by.tms.lesson21Calculator;

import by.tms.lesson21Calculator.web.CalculatorHttpServer;

public class WebAplication implements Application{
    private final CalculatorHttpServer calculatorHttpServer = new CalculatorHttpServer();

    @Override
    public double run() {
        calculatorHttpServer.go();
        return 0;
    }
}
