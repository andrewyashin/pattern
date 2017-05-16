import factories.AbstractFactory;
import factories.BaseFactory;
import factories.WhiteFactory;

public class Main {
    public static void main(String[] args) {
        BaseFactory baseFactory = AbstractFactory.getFactory("white");
        System.out.println(baseFactory.createCircle());
        System.out.println(baseFactory.createTriangle());

        baseFactory = AbstractFactory.getFactory("black");
        System.out.println(baseFactory.createCircle());
        System.out.println(baseFactory.createTriangle());
    }
}
