package factories;

import shape.Circle;
import shape.Triangle;

public interface BaseFactory {
    Circle createCircle(double radius);
    Triangle createTriangle();
}
