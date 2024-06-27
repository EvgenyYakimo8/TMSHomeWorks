package by.tms.lesson20.task1;

public class TwoThread extends Thread {

    private final int[] numbers;
    private int min;

    public TwoThread(int[] numbers) {
        this.numbers = numbers;
        this.min = Integer.MAX_VALUE;
    }

    @Override
    public void run() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < this.min) {
                this.min = numbers[i];
            }
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
