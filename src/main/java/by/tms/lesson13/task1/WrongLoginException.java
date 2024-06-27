package by.tms.lesson13.task1;

public class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }
}