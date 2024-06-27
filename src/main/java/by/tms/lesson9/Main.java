package by.tms.lesson9;

/**
 * Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
 * Переопределить методы voice(), eat(String food) чтобы они выводили верную
 * информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
 * Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
 * туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
 * или другую строку то он будет недоволен.
 */

/**
 * Написать такой конструктор, который запретит создание объекта класса Dog в других
 * классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
 * обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
 * способа.
 */
public class Main {
    public static void main(String[] args) {
        Animal tiger1 = new Tiger();
        Animal rabbit1 = new Rabbit();

        tiger1.voice();
        tiger1.eat("Мясо");

        System.out.println();

        rabbit1.voice();
        rabbit1.eat("Трава");

        System.out.println();

        Dog.getVoice();
        Dog.getEat("Косточка");

    }
}
