package factories;

import ecolor.Color;

public class AbstractFactory {
    public static BaseFactory getFactory(Color color){
        if(color.equals(Color.WHITE)){
            return new WhiteFactory();
        } else {
            return new BlackFactory();
        }
    }
}
