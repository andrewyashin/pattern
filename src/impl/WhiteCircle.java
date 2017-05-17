package impl;

import shape.Circle;

public class WhiteCircle implements Circle {
    double radius;

    public WhiteCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    //TODO: Draw shape with * or only print type of shape and it Color
    @Override
    public String draw() {
        return null;
    }
}
