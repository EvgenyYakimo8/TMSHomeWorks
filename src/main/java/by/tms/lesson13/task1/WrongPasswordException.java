package by.tms.lesson13.task1;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
