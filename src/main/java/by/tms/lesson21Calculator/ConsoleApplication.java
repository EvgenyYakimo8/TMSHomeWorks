package by.tms.lesson21Calculator;

import by.tms.lesson21Calculator.console.ConsoleReader;
import by.tms.lesson21Calculator.console.ConsoleWriter;
import by.tms.lesson21Calculator.model.Operation;
import by.tms.lesson21Calculator.service.OperationService;

import java.util.List;

public class ConsoleApplication implements Application {
    private final ConsoleReader consoleReader = new ConsoleReader();
    private final ConsoleWriter consoleWriter = new ConsoleWriter();
    private final OperationService operationService = new OperationService();

    @Override
    public double run(double num1, double num2, String type) {
        /*consoleWriter.write("Enter num1:");
        double num1 = consoleReader.readNumber();
        consoleWriter.write("Enter num2:");
        double num2 = consoleReader.readNumber();
        consoleWriter.write("Enter operation type: SUM, SUB, MUL, DIV");
        String type = consoleReader.readOperation();*/

        Operation operation = new Operation(num1, num2, type);
        Operation execute = operationService.executeOperation(operation);

        //consoleWriter.write("Result: " + execute.getResult());
        consoleWriter.write("History: ");

        List<Operation> allOperations = operationService.getAllOperations();
        for (Operation o : allOperations) {
            consoleWriter.write(String.format("Operation: %s %s %s %s",
                    o.getNum1(),
                    o.getNum2(),
                    o.getResult(),
                    o.getType()));
        }

        /*consoleWriter.write("Exit? [y/n]");
        String key = consoleReader.readCommand();
        if (key.equalsIgnoreCase("y")) {
            break;
        }*/
        return execute.getResult();
    }
}