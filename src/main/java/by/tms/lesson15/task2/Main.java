package by.tms.lesson15.task2;

/**
 * Создать класс, который будет хранить в себе коллекцию с названиями животных.
 * Реализовать методы удаления и добавления животных по следующим правилам:
 * добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
 * объекта этого класса в main методе другого класса.
 */
public class Main {
    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.addFirstAnimal("Cat");
        collection.addFirstAnimal("Dog");
        collection.addFirstAnimal("Goose");
        collection.addFirstAnimal("Cow");
        collection.addFirstAnimal("Elephant");
        System.out.println(collection.animals);
        collection.removeLastAnimal();
        collection.removeLastAnimal();
        collection.removeLastAnimal();
        System.out.println(collection.animals);
        collection.addFirstAnimal("Dragon");
        System.out.println(collection.animals);
    }
}
