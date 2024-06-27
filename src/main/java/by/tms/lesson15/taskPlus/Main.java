package by.tms.lesson15.taskPlus;

/**
 * Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
 * работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
 * основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
 * классов(т.е. это generic).
 * Предусмотреть операции(методы):
 * 1. добавления элемента
 * 2. удаления элемента
 * 3. получение элемента по индексу
 * 4. проверка есть ли элемент в коллекции
 * 5. очистка всей коллекции
 * Предусмотреть конструктор без параметров - создает массив размером
 * по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
 * массива. Предусмотреть возможность автоматического расширения коллекции при
 * добавлении элемента в том случае, когда коллекция уже заполнена.
 */
public class Main {
    /**
     * Методы, реализованные в castomGeneric ->
     * 1. addItem(T); Добавить Элемент
     * 2. addIndexItem(int, T); Добавить элемент в конкретное место по индексу
     * 3. printList(); Вывести все элементы на консоль
     * 4. get(int); найти элемент по индексу и вернуть его значение.
     * 5. findItemToValue(T); Найти элемент по значению
     * 5. removeItemToIndex(int); Удалить элемент по индексу
     * 6. isReal(T); Проверить есть ли элемент в коллекции
     * 7. cleanAll(); очистить всю коллекцию
     */
    public static void main(String[] args) {
        CastomGeneric<String> castomGeneric = new CastomGeneric<>(); // Создание свой коллекции
        castomGeneric.addItem("One");
        castomGeneric.addItem("Two");
        castomGeneric.addItem("Three");
        castomGeneric.addItem("Four");
        castomGeneric.addItem("Five");
        castomGeneric.addItem("Six");  // добавление элементов
        castomGeneric.addItem("Seven");
        castomGeneric.addItem("Eight");
        castomGeneric.addItem("Nine");
        castomGeneric.addItem("Ten");
        castomGeneric.addItem("Eleven");
        castomGeneric.addItem("Twelve");
        castomGeneric.printList(); // вывод на печать

        System.out.println(castomGeneric.get(12)); // Найти по индексу

        castomGeneric.addIndexItem(10, "GOG"); // Поставить новый элемент в нужное место оп индексу
        castomGeneric.printList();

        System.out.println(castomGeneric.findItemToValue("Ten")); // Найти элемент по значению и дать его индекс

        castomGeneric.removeItemToIndex(12); // удалить указанный элемент по индексу
        castomGeneric.printList();

        System.out.println(castomGeneric.isReal("Twelve")); // узнать существует ли элемент

        castomGeneric.cleanAll(); // очистить всю коллекцию
        castomGeneric.printList();
    }
}