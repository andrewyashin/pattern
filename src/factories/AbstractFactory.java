package factories;

import ecolor.Color;

//TODO: #15 If you added new Shapes, fix FactoryMethod and Enum!!
public class AbstractFactory {
    public static BaseFactory getFactory(Color color){
        if(color.equals(Color.WHITE)){
            return new WhiteFactory();
        } else {
            return new BlackFactory();
        }
    }
}
