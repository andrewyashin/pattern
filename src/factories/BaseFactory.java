package factories;

import shape.Circle;
import shape.Triangle;


//TODO: #16 If you added new Shapes add new methods in this class
public interface BaseFactory {
    Circle createCircle(double radius);
    Triangle createTriangle();
}
