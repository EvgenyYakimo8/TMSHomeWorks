package by.tms.lesson8TasksInLesson7.task2;

public class Triangle extends Figure {
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double sqare() {
        double halfMeter = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt(halfMeter * (halfMeter - this.sideA) * (halfMeter - this.sideB) * (halfMeter - this.sideC));
    }

    @Override
    double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    void info() {
        System.out.println("Это треугольник!");
    }

    @Override
    void infoSquare() {
        System.out.print("Площадь треугольника = ");
    }

    @Override
    void infoPerimeter() {
        System.out.print("Периметр треугольника = ");
    }
}