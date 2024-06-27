package by.tms.lesson9;

public class Rabbit extends Animal {
    @Override
    protected void voice() {
        System.out.println("Кроличий писк");
    }

    @Override
    protected void eat(String food) {
        if (food.equals("Трава")) {
            System.out.println("Кролик сточил " + food);
        }else {
            System.out.println("Дайте Зайчику ТРАВУ!");
        }

    }
}
