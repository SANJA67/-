package ru.dmdev.lesson24.decisionHW;

public class Rectangle extends Figure implements WithDiagonal {

    private final Point leftUpperPoint;
    private final Point rightLowerPoint;

    public Rectangle(Point leftUpperPoint, Point rightLowerPoint) {
        this.leftUpperPoint = leftUpperPoint;
        this.rightLowerPoint = rightLowerPoint;
    }

    @Override
    public double getDiagonal() {
        return leftUpperPoint.distance(rightLowerPoint); //(слева Верхняя точка) расстояние (справа Нижняя точка)
    }

    @Override
    public double getArea() {
        return (rightLowerPoint.getX() - leftUpperPoint.getX()) * (leftUpperPoint.getY() - rightLowerPoint.getY());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftUpperPoint=" + leftUpperPoint +
                ", rightLowerPoint=" + rightLowerPoint +
                "}";
    }

    public Point getLeftUpperPoint() {
        return leftUpperPoint;
    }

    public Point getRightLowerPoint() {
        return rightLowerPoint;
    }
}
