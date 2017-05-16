package factories;

import impl.*;
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
}
