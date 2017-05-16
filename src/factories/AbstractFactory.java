package factories;

public class AbstractFactory {
    public static BaseFactory getFactory(String color){
        if("white".equals(color)){
            return new WhiteFactory();
        } else if ("black".equals(color)){
            return new BlackFactory();
        }
        return null;
    }
}
