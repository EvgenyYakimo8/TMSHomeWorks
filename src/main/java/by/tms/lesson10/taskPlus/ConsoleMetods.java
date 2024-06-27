package by.tms.lesson10.taskPlus;

import java.util.Scanner;

public class ConsoleMetods {
    public static void chooseUsersID(User[] user) {
        System.out.println("Выберите ID пользователя для копирования (1, 2 или 3):");
        System.out.println("1. " + user[0].getName() + " -> " + user[0].getUserId());
        System.out.println("2. " + user[1].getName() + " -> " + user[1].getUserId());
        System.out.println("3. " + user[2].getName() + " -> " + user[2].getUserId());
        System.out.println("---------------------------------------------------------");
    }

    public static void printAboutClone() {
        System.out.println(
                "Введите желаемый тип клонирования (цифра 1 или 2):\n" +
                        "1. Поверхностное клонирование -> ...\n" +
                        "2. Глубокое клонирование -> ...\n" +
                        "--------------------------------------------------"
        );
    }

    public static int readTypeCloneFromConsole() {
        boolean flag = false;
        int vvod = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                vvod = scanner.nextInt();
                if (vvod == 1 || vvod == 2) {
                    flag = true;
                } else {
                    System.out.println("Требуется ввести 1 или 2. Попробуйте снова...");
                    flag = false;
                }
            } else {
                System.out.println("Требуется ввести простое число 1 или 2. Попробуйте снова...");
                flag = false;
            }
        } while (!flag);

        return vvod;

    }

    public static int readFromConsoleUsersID() {
        boolean flag = false;
        int vvod = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                vvod = scanner.nextInt();
                if (vvod == 1 || vvod == 2 || vvod == 3) {
                    flag = true;
                } else {
                    System.out.println("Требуется выбрать один из вариантов. Попробуйте снова...");
                    flag = false;
                }
            } else {
                System.out.println("Требуется ввести простое число 1, 2 или 3. Попробуйте снова...");
                flag = false;
            }
        } while (!flag);

        return vvod;
    }
}
