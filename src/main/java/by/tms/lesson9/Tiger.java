package by.tms.lesson9;

public class Tiger extends Animal {

    @Override
    protected void voice() {
        System.out.println("Mayyy, AGGRRrrrrrr");
    }

    @Override
    protected void eat(String food) {
        if (food.equals("Мясо")) {
            System.out.println("Тигр схомячил " + food);
        }else {
            System.out.println("Дайте Тигрёнку Мяса!");
        }

    }
}
