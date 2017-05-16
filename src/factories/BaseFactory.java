package factories;

import shape.Circle;
import shape.Triangle;

public interface BaseFactory {
    Circle createCircle();
    Triangle createTriangle();
}
