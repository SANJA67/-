package ru.dmdev.lesson24.decisionHW;

public abstract class Figure {

    public boolean isAreaEqual(Figure figure) {
        return getArea() == figure.getArea();
    }

    public abstract double getArea();
}
