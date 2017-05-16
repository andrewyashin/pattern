package impl;

import shape.Triangle;

public class RedTriangle implements Triangle {
    private double a;
    private double b;
    private double c;


    public RedTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return a + b + c;
    }

    @Override
    public double getSquare() {
        double p = getPerimetr() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String draw() {
        return null;
    }
}
