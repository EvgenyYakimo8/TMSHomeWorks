package by.tms.lesson20.task2;

public class ThreadSelectionSort extends Thread {
    int[] numbers;

    public ThreadSelectionSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        for (int left = 0; left < numbers.length; left++) {
            int minInd = left;
            for (int i = left; i < numbers.length; i++) {
                if (numbers[i] < numbers[minInd]) {
                    minInd = i;
                }
            }
            swap(numbers, left, minInd);
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