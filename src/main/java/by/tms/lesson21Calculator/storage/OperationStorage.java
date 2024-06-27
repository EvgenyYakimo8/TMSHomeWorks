package by.tms.lesson21Calculator.storage;

import by.tms.lesson21Calculator.model.Operation;

import java.util.List;

public interface OperationStorage {
    public void safe (Operation operation);
    public List<Operation> findAll();
}
