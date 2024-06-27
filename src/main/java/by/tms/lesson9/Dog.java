package by.tms.lesson9;

public class Dog extends Animal {

    private Dog() {
    }

    @Override
    protected void voice() {
        System.out.println("Woof Woof... GRrrr");
    }

    protected static void getVoice() {
        System.out.println("Woof Woof... GRrrr"); // для доступа к методу без объекта
    }


    @Override
    protected void eat(String food) {
        if (food.equals("Косточка")) {
            System.out.println("Песель схомячил " + food);
        } else {
            System.out.println("Дайте Песелю Косточку!");
        }

    }

    protected static void getEat(String food) { // для доступа к методу без объекта
        if (food.equals("Косточка")) {
            System.out.println("Песель схомячил " + food);
        } else {
            System.out.println("Дайте Песелю Косточку!");
        }

    }
}
