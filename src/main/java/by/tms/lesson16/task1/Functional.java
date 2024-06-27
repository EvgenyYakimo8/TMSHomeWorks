package by.tms.lesson16.task1;

import java.util.ArrayList;
import java.util.HashMap;

public class Functional {
    public static HashMap<String, Boolean> map(ArrayList<String> arrayList) {

        HashMap<String, Boolean> tempMap = new HashMap<>();
        /*Второй вариант решения - тут перебирается лист, но повторку ищем в tempMap*/
        for (String str: arrayList){
            if (tempMap.containsKey(str)){
                tempMap.put(str,true);
            }else {
                tempMap.put(str,false);
            }
        }

        /*Первый вариант решения - тут перебирается лист и в нем же поиск повторки*/
        for (int i = 0; i < arrayList.size(); i++) {
            int count = 0;
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    count += 1;
                    if (count > 1) {
                        tempMap.put(arrayList.get(i), true);
                        break;
                    }
                }
            }
            if (count < 2) {
                tempMap.put(arrayList.get(i), false);
            }
        }
        return tempMap;
    }
}