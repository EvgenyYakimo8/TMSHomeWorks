package by.tms.lesson20.task2;

public class ThreadBubleSort extends Thread {
    int[] numbers;

    public ThreadBubleSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[i - 1]) {
                    swap(numbers, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    private void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}