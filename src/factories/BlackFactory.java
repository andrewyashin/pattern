package factories;

import impl.BlackCircle;
import impl.BlackTriangle;
import shape.Circle;
import shape.Triangle;

public class BlackFactory implements BaseFactory {
    @Override
    public Circle createCircle() {
        return new BlackCircle();
    }

    @Override
    public Triangle createTriangle() {
        return new BlackTriangle();
    }
}
