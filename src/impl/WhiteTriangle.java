package impl;

import shape.Triangle;

public class WhiteTriangle implements Triangle {

    private double a,b,c;

    public WhiteTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public double getSquare() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    //TODO: #9 Draw shape with * or only print type of shape and it Color
    @Override
    public String draw() {
        return null;
    }
}
