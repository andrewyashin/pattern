package impl;

import shape.Circle;

public class BlackCircle implements Circle {
    double radius;

    public BlackCircle(double radius) {
        this.radius = radius;
    }

    //TODO: #1 Draw shape with * or only print type of shape and it Color
    @Override
    public String draw() {
        return null;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }
}
