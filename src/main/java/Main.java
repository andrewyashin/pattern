import ecolor.Color;
import factories.AbstractFactory;
import factories.BaseFactory;
import shape.Circle;
import shape.Rectangle;
import shape.Triangle;


//TODO: #12 add some new factories and shapes
//TODO: #13 you can create only one interface with name Shape and Circle, Triangle , etc can extends this one.
//TODO: #14 test every shape, as I have tested Circle in main before
public class Main {
    public static void main(String[] args) {
        BaseFactory baseFactory = AbstractFactory.getFactory(Color.WHITE);
        printCircle(baseFactory.createCircle(5));
        printRectangle(baseFactory.createRectangle(1,2));
        printTriangle(baseFactory.createTriangle(1,1,1));

        baseFactory = AbstractFactory.getFactory(Color.BLACK);
        printCircle(baseFactory.createCircle(5));
        printRectangle(baseFactory.createRectangle(1,2));
        printTriangle(baseFactory.createTriangle(1,1,1));

        baseFactory = AbstractFactory.getFactory(Color.RED);
        printCircle(baseFactory.createCircle(5));
        printRectangle(baseFactory.createRectangle(1,2));
        printTriangle(baseFactory.createTriangle(1,1,1));


    }

    static void printCircle(Circle shape){
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getSquare());
        System.out.println(shape.draw());
        System.out.println(shape);
    }

    static void printRectangle(Rectangle shape){
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getSquare());
        System.out.println(shape.draw());
        System.out.println(shape);
    }

    static void printTriangle(Triangle shape){
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getSquare());
        System.out.println(shape.draw());
        System.out.println(shape);
    }
}
