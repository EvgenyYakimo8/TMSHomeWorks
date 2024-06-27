package by.tms.lesson2;

/**
 * @author Евгений Якимов
 * Тут я пробую писать комментарии JavaDOC
 * <p>
 * В данном классе будет описано решение задачи по многострочному выводу звездочек в консоль.
 * <p>
 * Эти комментари пишутся до объявления класса?
 * Или где хочу там и пишу?)))
 */

public class Task_In_Telegram_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            String star = "*";
            for (int j = 0; j < 5; j++) {
                System.out.print(star + " ");
            }
            System.out.println();
        }
    }
}
