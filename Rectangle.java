package ru.dmdev.lesson24.homework;

public class Rectangle extends Figure implements CalculatingPerimeter, CalculatingDiagonal{
     public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    public double calculateThePerimeter() {
        return getPoint1().distance(getPoint2()) +  getPoint2().distance(getPoint3()) +  getPoint3().distance(getPoint4()) +  getPoint4().distance(getPoint1());
    }

    @Override
    public double calculateTheDiagonal() {
        return getPoint1().distance(getPoint3());
    }
}
