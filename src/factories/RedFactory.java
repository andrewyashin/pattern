package factories;

import impl.*;
import shape.*;

public class RedFactory implements BaseFactory {

    @Override
    public Circle createCircle(double radius) {
        return new RedCircle(radius);
    }

    @Override
    public Triangle createTriangle(double a, double b, double c) {
        return new RedTriangle(a, b, c);
    }

    @Override
    public Rectangle createRectangle(double a, double b) {
        return new RedRectangle(a,b);
    }
}
