package ru.dmdev.lesson24.homework;


public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(10, 10);
        Point point2 = new Point(20, 10);
        Point point3 = new Point(20, 40);
        Point point4 = new Point(10, 40);
        Point point5 = new Point(30, 20);
        Triangle triangle = new Triangle(point1, point2, point3);
        Rectangle rectangle = new Rectangle(point1, point2, point3, point4);
        Pentagon pentagon = new Pentagon(point1, point2, point3, point4, point5);

        System.out.println("Периметр треугольника: " + triangle.calculateThePerimeter());
        System.out.println("Длина медианы треугольника: " + triangle.calculateTheMedian());
        System.out.println("Периметр четырехугольника: " + rectangle.calculateThePerimeter());
        System.out.println("Длина диагонали четырехугольника: " + rectangle.calculateTheDiagonal());
        System.out.println("Периметр пятиугольника: " + pentagon.calculateThePerimeter());
        System.out.println("Площадь пятиугольника: " + pentagon.calculateArea());
    }
}
