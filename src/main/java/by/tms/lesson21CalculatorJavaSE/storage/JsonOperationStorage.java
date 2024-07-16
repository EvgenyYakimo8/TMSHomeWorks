package by.tms.lesson21CalculatorJavaSE.storage;

import by.tms.lesson21CalculatorJavaSE.model.Operation;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonOperationStorage implements OperationStorage {
    private final Gson gson = new Gson();
    private final File HISTORY_FILE = new File("src/main/java/by/tms/lesson21CalculatorJavaSE/history.json");

    @Override
    public void safe(Operation operation) {
        List<Operation> operations = new ArrayList<>();
        try (FileReader reader = new FileReader(HISTORY_FILE)) {
            TypeToken<ArrayList<Operation>> collect = new TypeToken<>() {};
            operations = gson.fromJson(reader, collect);
            operations.add(operation);
        } catch (NullPointerException | IOException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter writer = new FileWriter(HISTORY_FILE)){
            gson.toJson(operations, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Operation> findAll() {
        /*try {
            FileReader reader = new FileReader(HISTORY_FILE);
            TypeToken<ArrayList<Operation>> collect = new TypeToken<>() {
            };
            return gson.fromJson(reader, collect);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/
        return null;
    }
}