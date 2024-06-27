package by.tms.lesson8TasksInLesson7.task1;

/**
 * Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
 * который печатает название должности и имплементировать этот метод в созданные
 * классы.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();


        director.printPost();
        worker.printPost();
        accountant.printPost();
    }
}
