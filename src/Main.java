import ecolor.Color;
import factories.AbstractFactory;
import factories.BaseFactory;

public class Main {
    public static void main(String[] args) {
        BaseFactory baseFactory = AbstractFactory.getFactory(Color.WHITE);
        System.out.println(baseFactory.createCircle(5));
        System.out.println(baseFactory.createTriangle());

        baseFactory = AbstractFactory.getFactory(Color.BLACK);
        System.out.println(baseFactory.createCircle(5));
        System.out.println(baseFactory.createTriangle());
    }
}
