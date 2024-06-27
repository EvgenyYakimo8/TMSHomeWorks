package by.tms.lesson20.taskPlus;

public class Buyer implements Runnable {
    private int count;
    private final Shop shop;

    public Buyer(Shop shop) {
        this.shop = shop;
        this.count = 0;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                shop.buyWarehouseProducts();
                this.count++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Покупатель в итоге купил: " + this.count);
    }
}