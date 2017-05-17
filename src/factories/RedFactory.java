package factories;

import impl.circle.RedCircle;
import impl.rectangle.RedRectangle;
import impl.triangle.RedTriangle;
import shape.*;

public class RedFactory implements BaseFactory {

    @Override
    public Circle createCircle(double radius) {
        return new RedCircle(radius);
    }

    @Override
    public Triangle createTriangle() {
        return null;
    }



    public Triangle createTriangle(double a, double b, double c) {
        return new RedTriangle(a, b, c);
    }

    @Override
    public Rectangle createRectangle(double a, double b) {
        return new RedRectangle(a,b);
    }
}
