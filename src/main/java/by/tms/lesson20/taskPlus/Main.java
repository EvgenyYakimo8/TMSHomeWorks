package by.tms.lesson20.taskPlus;

/**
 * Имеются сущности Магазин, Производитель, Покупатель. Цель задачи сделать так
 * что-бы производитель произвел 5 единиц продукта, а покупатель их купил. Пока
 * производитель не произвел продукт, покупатель не может его купить. При этом
 * одновременно в магазине может находиться не более 3 товаров.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*Создаём три сущности*/
        Shop shop = new Shop();
        Manufacturer manufacturer = new Manufacturer(shop);
        Buyer buyer = new Buyer(shop);

        /*Создаём два потока (активируем работу Завода и Покупателя)*/
        new Thread(manufacturer).start();
        new Thread(buyer).start();
    }
}