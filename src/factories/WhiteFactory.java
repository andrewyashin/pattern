package factories;

import shape.Circle;
import shape.Triangle;

public class WhiteFactory implements BaseFactory {
    @Override
    public Circle createCircle() {
        return null;
    }

    @Override
    public Triangle createTriangle() {
        return null;
    }
}
