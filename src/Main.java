import ecolor.Color;
import factories.AbstractFactory;
import factories.BaseFactory;
import shape.Circle;
import shape.Rectangle;


//TODO: #12 add some new factories and shapes
//TODO: #13 you can create only one interface with name Shape and Circle, Triangle , etc can extends this one.
//TODO: #14 test every shape, as I have tested Circle in main before
public class Main {
    public static void main(String[] args) {
        BaseFactory baseFactory = AbstractFactory.getFactory(Color.WHITE);

        Circle circle = baseFactory.createCircle(5);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getSquare());
        System.out.println(circle.draw());
        System.out.println(circle);


        System.out.println(baseFactory.createTriangle(3,4,5));

        baseFactory = AbstractFactory.getFactory(Color.BLACK);
        System.out.println(baseFactory.createCircle(5));
        System.out.println(baseFactory.createTriangle(3,4,5));




        Rectangle rectangle = baseFactory.createRectangle(5,4);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getSquare());
        System.out.println(rectangle.draw());
        System.out.println(rectangle);


    }
}
