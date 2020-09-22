package pattern.creational_patterns.builder_pattern;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
