package pattern.creational_patterns.abstract_factory_pattern.one;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}