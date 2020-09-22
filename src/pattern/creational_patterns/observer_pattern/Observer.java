package pattern.creational_patterns.observer_pattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
