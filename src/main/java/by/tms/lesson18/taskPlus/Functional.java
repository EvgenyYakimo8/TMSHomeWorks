package by.tms.lesson18.taskPlus;

import java.util.HashMap;
import java.util.List;

public class Functional {
    public void letsGO(HashMap<Integer, String> map) {
        List<String> list = map.entrySet()
                .stream()
                .filter((key) -> List.of(1, 2, 5, 8, 9, 13).contains(key.getKey()))
                .filter((value) -> (value.getValue().length()) % 2 != 0)
                .map((elem) -> new StringBuilder(elem.getValue()).reverse().toString())
                .toList();
        System.out.println(list);
    }
}