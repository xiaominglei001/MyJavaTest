package pattern.creational_patterns.abstract_factory_pattern;

import pattern.creational_patterns.abstract_factory_pattern.one.Shape;
import pattern.creational_patterns.abstract_factory_pattern.two.Color;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
