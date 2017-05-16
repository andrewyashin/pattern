package impl;

import shape.Circle;

public class WhiteCircle implements Circle {
    double radius;

    public WhiteCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimetr() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }
}
