package pattern.creational_patterns.builder_pattern;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }


    @Override
    public abstract float price();
}
