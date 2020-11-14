package ru.dmdev.lesson24.homework;

public class Pentagon extends Figure implements CalculatingPerimeter, CalculatingArea {

    public Pentagon(Point point1, Point point2, Point point3, Point point4, Point point5) {
        super(point1, point2, point3, point4, point5);
    }

    @Override
    public double calculateThePerimeter() {
        return getPoint1().distance(getPoint2())
                +  getPoint2().distance(getPoint3())
                +  getPoint3().distance(getPoint4())
                +  getPoint4().distance(getPoint5())
                +  getPoint5().distance(getPoint1());
    }

    @Override
    public double calculateArea() {
        double length12 = getPoint1().distance(getPoint2());
        double length23 = getPoint2().distance(getPoint3());
        double length31 = getPoint3().distance(getPoint1());
        double semiPerimeter1 = (length12 + length23 + length31) / 2;
        double areaOfATriangle1 = Math.sqrt(semiPerimeter1 * (semiPerimeter1 - length12) * (semiPerimeter1 - length23) * (semiPerimeter1 - length31));
        double length13 = getPoint1().distance(getPoint3());
        double length35 = getPoint3().distance(getPoint5());
        double length51 = getPoint5().distance(getPoint1());
        double semiPerimeter2 = (length13 + length35 + length51) / 2;
        double areaOfATriangle2 = Math.sqrt(semiPerimeter1 * (semiPerimeter2 - length13) * (semiPerimeter2 - length35) * (semiPerimeter2 - length51));
        double length53 = getPoint5().distance(getPoint3());
        double length34 = getPoint3().distance(getPoint4());
        double length45 = getPoint4().distance(getPoint5());
        double semiPerimeter3 = (length53 + length34 + length45) / 2;
        double areaOfATriangle3 = Math.sqrt(semiPerimeter1 * (semiPerimeter3 - length53) * (semiPerimeter3 - length34) * (semiPerimeter3 - length45));
        return areaOfATriangle1 + areaOfATriangle2 + areaOfATriangle3;
    }
}
