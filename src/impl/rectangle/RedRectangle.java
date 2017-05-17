package impl.rectangle;

import shape.Rectangle;

/**
 * Created by timur on 17.05.2017.
 */
public class RedRectangle implements Rectangle {
    private double a,b;

    public RedRectangle(double a,double b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double getPerimeter() {
        return (a+b)*2;
    }

    @Override
    public double getSquare() {
        return a*b;
    }
}
