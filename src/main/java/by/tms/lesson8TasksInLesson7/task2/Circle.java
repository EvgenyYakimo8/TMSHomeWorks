package by.tms.lesson8TasksInLesson7.task2;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double sqare() {
        return Math.PI * (Math.pow(this.radius, 2));
    }

    @Override
    double perimeter() {
        return 2 * (Math.PI * this.radius);
    }

    @Override
    void info() {
        System.out.println("Это круг!");
    }

    @Override
    void infoSquare() {
        System.out.print("Площадь круга = ");
    }

    @Override
    void infoPerimeter() {
        System.out.print("Длинна окружности круга = ");
    }
}
