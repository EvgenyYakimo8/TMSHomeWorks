package by.tms.lesson18.taskPlus;

import java.util.HashMap;

/**
 * Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
 * этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
 * Среди отобранных значений отобрать только те, которые имеют нечетное количество
 * букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Kain");
        map.put(2, "Frodo");
        map.put(3, "Gendalf");
        map.put(4, "Tarzan");
        map.put(5, "Telepuzik");
        map.put(6, "Supermen");
        map.put(7, "Legolaz");
        map.put(8, "Gerald");

        Functional functional = new Functional();
        functional.letsGO(map);
    }
}