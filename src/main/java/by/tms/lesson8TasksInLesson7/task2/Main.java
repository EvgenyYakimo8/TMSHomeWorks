package by.tms.lesson8TasksInLesson7.task2;

/**
 * Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
 * функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
 * абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
 * периметра всех фигур в массиве.
 */

public class Main {
    public static void main(String[] args) {

        double sum = 0;

        Figure[] figures = new Figure[5];
        figures[0] = new Circle(15);
        figures[1] = new Circle(8);
        figures[2] = new Rectangle(4);
        figures[3] = new Triangle(2, 3, 4);
        figures[4] = new Triangle(5, 3, 7);

        for (Figure f : figures) {
            f.info();
            f.infoPerimeter();
            System.out.printf("%.2f", f.perimeter());
            System.out.println();
            f.infoSquare();
            System.out.printf("%.2f", f.sqare());
            System.out.println();
            System.out.println("------------------------------------------------------------------");
            sum += f.perimeter();
        }
        System.out.printf("Cумма периметра всех фигур в массиве -> " + "%.2f", sum);


    }
}
