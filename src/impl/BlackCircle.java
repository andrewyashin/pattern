package impl;

import shape.Circle;

public class BlackCircle implements Circle {
    double radius;

    public BlackCircle(double radius) {
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
