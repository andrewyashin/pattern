package factories;

import impl.WhiteCircle;
import impl.WhiteRectangle;
import impl.WhiteTriangle;
import shape.Circle;
import shape.Rectangle;
import shape.Triangle;

public class WhiteFactory implements BaseFactory {
    @Override
    public Circle createCircle(double radius) {
        return new WhiteCircle(radius);
    }

    @Override
    public Triangle createTriangle(double a, double b, double c) {
        return new WhiteTriangle(a,b,c);
    }

    @Override
    public Rectangle createRectangle(double a, double b) {
        return new WhiteRectangle(a,b);
    }
}
