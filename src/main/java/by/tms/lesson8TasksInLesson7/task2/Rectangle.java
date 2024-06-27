package by.tms.lesson8TasksInLesson7.task2;

public class Rectangle extends Figure {

    private double side;

    public Rectangle(double side) {
        this.side = side;
    }

    @Override
    double sqare() {
        return Math.pow(this.side, 2);
    }

    @Override
    double perimeter() {
        return this.side * 4;
    }

    @Override
    void info() {
        System.out.println("Это квадрат!");
    }

    @Override
    void infoSquare() {
        System.out.print("Площадь квадрата = ");
    }

    @Override
    void infoPerimeter() {
        System.out.print("Периметр квадрата = ");
    }
}
