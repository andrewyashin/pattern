package factories;

import impl.WhiteCircle;
import impl.WhiteTriangle;
import shape.Circle;
import shape.Triangle;

public class WhiteFactory implements BaseFactory {
    @Override
    public Circle createCircle(double radius) {
        return new WhiteCircle(radius);
    }

    @Override
    public Triangle createTriangle() {
        return new WhiteTriangle();
    }
}
