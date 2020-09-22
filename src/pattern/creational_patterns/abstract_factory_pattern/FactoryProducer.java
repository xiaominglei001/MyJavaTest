package pattern.creational_patterns.abstract_factory_pattern;

import pattern.creational_patterns.abstract_factory_pattern.one.ShapeFactory;
import pattern.creational_patterns.abstract_factory_pattern.two.ColorFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
