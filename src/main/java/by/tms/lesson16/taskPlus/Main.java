package by.tms.lesson16.taskPlus;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Задана строка, которая может иметь внутри себя скобки. Скобкой считается
 * любой из следующих символов — «(«, «)», «[«, «]», «{«, «}». Проверить
 * сбалансированность расстановки скобок в этой строке. Набор скобок считается
 * сбалансированной парой, если открывающая скобка "(", "[" и "{" стоит слева от
 * соответствующей закрывающей скобки ")", "]" и "} ", соответственно. Строка,
 * содержащая пары скобок, не сбалансирована, если набор заключенных в нее
 * скобок не совпадает .
 * Например, если ввод «{[(])}», пара квадратных скобок «[]» заключает в себя
 * одну несбалансированную открывающую круглую скобку «(». Аналогично, пара
 * круглых скобок «() ", заключает в себя одну несбалансированную
 * закрывающую квадратную скобку "]". Таким образом, входная строка "{[(])}"
 * несбалансированная.
 * Пример
 * () - сбалансирована
 * [()] - сбалансирована
 * {[()]} - сбалансирована
 * ([{{[(())]}}]) - сбалансирована
 * {{[]()}}}} - не сбалансирована
 * {[(])} - не сбалансирована
 */
public class Main {
    public static void main(String[] args) {
        Deque<String> quene = new ArrayDeque<>();

        /*Удаляем все кроме скобок и преобразуем в массив символов*/
        String str = "([{{[(())]}}])";
        str = str.replaceAll("[\\w,.!?:\\s\"]", "");
        char[] charArray = str.toCharArray();

        /*Идем по массиву и сравниваем скобки, если очередь в итоге
        осталась путой - то строка считается сбалансированной, иначе нет*/
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[0] == ')' || charArray[0] == '}' || charArray[0] == ']') {
                quene.add(String.valueOf(charArray[i]));
                break;
            }

            switch (charArray[i]) {
                case '(', '[', '{' -> quene.add(String.valueOf(charArray[i]));
                case ')' -> {
                    if (!quene.isEmpty() && quene.getLast().equals("(")) {
                        quene.removeLast();
                    } else {
                        quene.add(String.valueOf(charArray[i]));
                    }
                }
                case '}' -> {
                    if (!quene.isEmpty() && quene.getLast().equals("{")) {
                        quene.removeLast();
                    } else {
                        quene.add(String.valueOf(charArray[i]));
                    }
                }
                case ']' -> {
                    if (!quene.isEmpty() && quene.getLast().equals("[")) {
                        quene.removeLast();
                    } else {
                        quene.add(String.valueOf(charArray[i]));
                    }
                }
            }
        }
        System.out.println(quene.isEmpty() ? "Строка сбалансирована!" : "Строка не сбалансирована!");
    }
}
