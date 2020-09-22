package pattern.creational_patterns.abstract_factory_pattern.one;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
