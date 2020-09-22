package pattern.creational_patterns.abstract_factory_pattern.one;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
