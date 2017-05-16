package factories;

import impl.BlackCircle;
import impl.BlackTriangle;
import shape.Circle;
import shape.Triangle;

public class BlackFactory implements BaseFactory {
    @Override
    public Circle createCircle(double radius) {
        return new BlackCircle(radius);
    }

    @Override
    public Triangle createTriangle() {
        return new BlackTriangle();
    }
}
