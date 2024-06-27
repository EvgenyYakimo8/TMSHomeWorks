package by.tms.lesson10.task1;

/**
 * Создать класс для описания пользователя системы. Переопределить в классе методы
 * toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
 * значением полей и сравнить с помощью метода equals.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        User potter = new User("Potter", "1111AB777");
        User gimli = (User) potter.clone();

        System.out.println(potter);
        System.out.println(gimli);

        System.out.println(potter.equals(gimli));


    }
}
