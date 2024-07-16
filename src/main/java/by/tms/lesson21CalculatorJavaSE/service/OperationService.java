package by.tms.lesson21CalculatorJavaSE.service;

import by.tms.lesson21CalculatorJavaSE.model.Operation;
import by.tms.lesson21CalculatorJavaSE.storage.FIleOperationStorage;
import by.tms.lesson21CalculatorJavaSE.storage.OperationStorage;

import java.util.List;

public class OperationService {

    private final OperationStorage operationStorage = new FIleOperationStorage();

    public Operation executeOperation(Operation operation) {
        switch (operation.getType()) {
            case "SUM", "sum":
                operation.setResult(operation.getNum1() + operation.getNum2());
                operationStorage.safe(operation);
                return operation;
            case "SUB", "sub":
                operation.setResult(operation.getNum1() - operation.getNum2());
                operationStorage.safe(operation);
                return operation;
            case "MUL", "mul":
                operation.setResult(operation.getNum1() * operation.getNum2());
                operationStorage.safe(operation);
                return operation;
            case "DIV", "div":
                operation.setResult(operation.getNum1() / operation.getNum2());
                operationStorage.safe(operation);
                return operation;
        }
        throw new IllegalArgumentException("Operation type not supported");
    }
    public List<Operation> getAllOperations() {
        return operationStorage.findAll();
    }
}