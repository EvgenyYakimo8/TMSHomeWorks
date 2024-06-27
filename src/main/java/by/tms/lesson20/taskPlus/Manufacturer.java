package by.tms.lesson20.taskPlus;

public class Manufacturer implements Runnable {
    private int count;
    private final Shop shop;

    public Manufacturer(Shop shop) {
        this.shop = shop;
        this.count = 0;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                shop.addWarehouseProducts();
                this.count++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Производитель в итоге произвел: " + this.count);
    }
}
