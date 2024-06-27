package by.tms.lesson4;

import java.util.Scanner;

/**
 * Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
 * */
public class Task1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();


        int[] array = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = (int)Math.round(Math.random()*10);
        }

        for (int i = 0; i < sizeArray; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        for (int i = sizeArray-1; i >= 0; i--) {
            System.out.print(array[i] + "   ");
        }
        System.out.println();
        System.out.println();
        System.out.println();



    }
}

