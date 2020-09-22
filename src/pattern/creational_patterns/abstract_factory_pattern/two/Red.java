package pattern.creational_patterns.abstract_factory_pattern.two;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
