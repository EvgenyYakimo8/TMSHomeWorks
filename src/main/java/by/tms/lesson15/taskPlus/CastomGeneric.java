package by.tms.lesson15.taskPlus;

public class CastomGeneric<T> {
    private T[] list;
    private int sizeList;
    private final int DEFAULT_CAPACITY = 10;

    public CastomGeneric() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public CastomGeneric(int sizeList) {
        if (sizeList <= 0) {
            throw new IllegalArgumentException("Capasity <=0");
        } else {
            list = (T[]) new Object[sizeList];
        }
    }

    public void addItem(T item) {
        if (((this.sizeList / list.length) * 100) >= 80) {
            T[] listOld = list;
            list = (T[]) new Object[list.length * 2];
            for (int i = 0; i < listOld.length; i++) {
                list[i] = listOld[i];
            }
            list[this.sizeList++] = item;
        } else {
            list[this.sizeList++] = item;
        }
    }

    public void addIndexItem(int index, T item) {
        for (int i = sizeList; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        sizeList++;
    }

    public void printList() {
        System.out.print("\n| ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " | ");
        }
        System.out.println("\n");
    }

    public T get(int index) {
        if ((index < 0) || (index > (sizeList - 1))) {
            System.out.println("Не верный индекс элемента, укажите индекс из диапазона от 0 до " + (sizeList - 1));
            return null;
        }
        return list[index];
    }

    public int findItemToValue(T item) {
        for (int i = 0; i < sizeList - 1; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public void removeItemToIndex(int index) {
        if ((index < 0) || (index > (sizeList - 1))) {
            System.out.println("Не верный индекс элемента, укажите индекс из диапазона от 0 до " + (sizeList - 1));
            return;
        }
        list[index] = null;
        for (int i = index; i < sizeList; i++) {
            list[i] = list[i + 1];
        }
    }

    public boolean isReal(T item) {
        for (int i = 0; i < sizeList - 1; i++) {
            if (list[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    public void cleanAll() {
        for (int i = 0; i < sizeList; i++) {
            list[i] = null;
        }
    }
}