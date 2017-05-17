package factories;

import impl.circle.BlackCircle;
import impl.rectangle.BlackRectangle;
import impl.triangle.BlackTriangle;
import shape.Circle;
import shape.Rectangle;
import shape.Triangle;

public class BlackFactory implements BaseFactory {
    @Override
    public Circle createCircle(double radius) {
        return new BlackCircle(radius);
    }

    @Override
    public Triangle createTriangle(double a, double b, double c) {
        return new BlackTriangle(a,b,c);
    }

    @Override
    public Rectangle createRectangle(double a, double b) {
        return new BlackRectangle(a,b);
    }
}
