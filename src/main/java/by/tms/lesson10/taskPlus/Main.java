package by.tms.lesson10.taskPlus;

import java.util.Scanner;

/**
 * Создать программу для реализации поверхностного и глубокого клонирования объекта
 * класса User. Пусть на вход программе будет передаваться тип операции клонирования
 * (поверхностное клонирование или глубокое), а также id юзера для клонирования.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        int usersID = 0;

        User[] usersArray = new User[4];
        usersArray[0] = new User("Potter", "1111AB777");
        usersArray[1] = new User("Gimli", "888GG999");
        usersArray[2] = new User("Gendalf", "333KC444");

        ConsoleMetods.chooseUsersID(usersArray);
        switch (ConsoleMetods.readFromConsoleUsersID()) {
            case 1 -> usersID = 0;
            case 2 -> usersID = 1;
            case 3 -> usersID = 2;
        }

        ConsoleMetods.printAboutClone();
        usersArray[3] = switch (ConsoleMetods.readTypeCloneFromConsole()) {
            case 1 -> (User) usersArray[usersID].clone();
            case 2 -> (User) usersArray[usersID].deepclone();
            default -> throw new IllegalStateException("Unexpected value: " + ConsoleMetods.readTypeCloneFromConsole());
        };

        usersArray[usersID].setTypeOfComputer("HomeComputer");
        System.out.println(usersArray[0] + "\n" + usersArray[1] + "\n" + usersArray[2] + "\n" + usersArray[3]);
    }
}