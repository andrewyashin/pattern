package impl;

import shape.Circle;
public class RedCircle implements Circle {
    private double radius;

    public RedCircle(double radius) {
        this.radius = radius;

    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return null;
    }
}


