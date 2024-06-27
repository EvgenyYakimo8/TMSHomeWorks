package by.tms.lesson16.task1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
 * строка является ключом, и ее значение равно true, если эта строка встречается в массиве
 * 2 или более раз. Пример:
 * wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
 * wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listKeys = new ArrayList<>();
        listKeys.add("a");
        listKeys.add("b");
        listKeys.add("a");
        listKeys.add("c");
        listKeys.add("b");

        /*listKeys.add("c");
        listKeys.add("b");
        listKeys.add("a");*/

        /*listKeys.add("c");
        listKeys.add("c");
        listKeys.add("c");
        listKeys.add("c");*/

        HashMap<String, Boolean> hashMap = Functional.map(listKeys);
        System.out.println(hashMap);
    }
}