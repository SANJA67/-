package ru.dmdev.lesson24.homework;

public class Triangle extends Figure implements CalculatingPerimeter, CalculatingMedian {

    public Triangle(Point point1, Point point2, Point point3) {
        super(point1, point2, point3);
    }

    @Override
    public double calculateThePerimeter() {
        return getPoint1().distance(getPoint2()) +  getPoint2().distance(getPoint3()) +  getPoint1().distance(getPoint3());
    }

    @Override
    public double calculateTheMedian() {
        return getPoint1().distanceMiddle(getPoint2()).distance(getPoint3());
    }
}
