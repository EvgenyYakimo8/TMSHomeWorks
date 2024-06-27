package by.tms.lesson20.task2;

public class ThreadInsertionSort extends Thread {
    int[] numbers;

    public ThreadInsertionSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        for (int left = 0; left < numbers.length; left++) {
            // Вытаскиваем значение элемента
            int value = numbers[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < numbers[i]) {
                    numbers[i + 1] = numbers[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            numbers[i + 1] = value;
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}