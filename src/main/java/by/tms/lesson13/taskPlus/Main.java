package by.tms.lesson13.taskPlus;

/**
 * Написать try/catch/finally, в котором finally вызван не будет.
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.exit(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Finally");
        }
    }
}
