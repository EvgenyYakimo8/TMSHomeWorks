package by.tms.lesson16.task2;

import java.util.ArrayList;
import java.util.HashMap;

public class Functional {

    public static HashMap<String, String> refractor(ArrayList arrayList) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            char[] charArray = arrayList.get(i).toString().toCharArray();
            String strFirst = String.valueOf(charArray[0]);
            String strLast = String.valueOf(charArray[charArray.length - 1]);
            hashMap.put(strFirst, strLast);
        }
        return hashMap;
    }


}
