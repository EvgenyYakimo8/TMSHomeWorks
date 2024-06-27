package by.tms.lesson6;

/**
 * Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
 * метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
 * который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
 * выводит текущую информацию о карточке. Напишите программу, которая создает три
 * объекта класса CreditCard у которых заданы номер счета и начальная сумма.
 * Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
 * третьей. Выведите на экран текущее состояние всех трех карточек.
 */
public class Task1Main {
    public static void main(String[] args) {
        Task1CreditCard creditCard1 = new Task1CreditCard(8888, 700);
        Task1CreditCard creditCard2 = new Task1CreditCard(8889, 900);
        Task1CreditCard creditCard3 = new Task1CreditCard(8890, 1500);

        creditCard1.addAmount(300);
        creditCard2.addAmount(100);
        creditCard3.withdrawAmount(500);

        creditCard1.aboutAccount();
        creditCard2.aboutAccount();
        creditCard3.aboutAccount();


    }
}
