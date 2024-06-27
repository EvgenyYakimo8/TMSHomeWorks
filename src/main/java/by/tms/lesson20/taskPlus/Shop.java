package by.tms.lesson20.taskPlus;

public class Shop {
    private int warehouseProducts;

    public Shop() {
        this.warehouseProducts = 0;
    }

    public synchronized void buyWarehouseProducts() throws InterruptedException {
        while (this.warehouseProducts < 1) {
            wait();
        }
        this.warehouseProducts--;
        System.out.println("Куплен один товар," +
                " остаток на складе магазина: " + this.warehouseProducts);
        notify();
    }

    public synchronized void addWarehouseProducts() throws InterruptedException {
        while (this.warehouseProducts >= 3) {
            wait();
        }
        this.warehouseProducts++;
        System.out.println("Произведен и отгружен 1 товар, " +
                "остаток на складе магазина: " + this.warehouseProducts);
        notify();
    }
}
