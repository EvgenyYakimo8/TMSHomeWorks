package by.tms.lesson20.task1;

public class OneThread extends Thread {

    private final int[] numbers;
    private int max;

    public OneThread(int[] numbers) {
        this.numbers = numbers;
        this.max = Integer.MIN_VALUE;
    }

    @Override
    public void run() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > this.max) {
                this.max = numbers[i];
            }
        }
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
