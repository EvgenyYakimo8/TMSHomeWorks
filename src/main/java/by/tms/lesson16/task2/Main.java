package by.tms.lesson16.task2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * На вход поступает массив непустых строк, создайте и верните Map<String,
 * String> следующим образом: для каждой строки добавьте ее первый символ в
 * качестве ключа с последним символом в качестве значения. Пример:
 * pairs(["code", "bug"]) → {"b": "g", "c": "e"}
 * pairs(["man", "moon", "main"]) → {"m": "n"}
 * pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        /*arrayList.add("code");
        arrayList.add("bug");*/

        /*arrayList.add("man");
        arrayList.add("moon");
        arrayList.add("main");*/

        arrayList.add("man");
        arrayList.add("moon");
        arrayList.add("good");
        arrayList.add("night");

        HashMap<String, String> hashMap = Functional.refractor(arrayList);
        System.out.println(hashMap);
    }
}