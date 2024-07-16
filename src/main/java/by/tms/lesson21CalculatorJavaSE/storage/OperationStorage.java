package by.tms.lesson21CalculatorJavaSE.storage;

import by.tms.lesson21CalculatorJavaSE.model.Operation;

import java.util.List;

public interface OperationStorage {
    public void safe (Operation operation);
    public List<Operation> findAll();
}
