package observer_pattern;

public abstract class Subscriber {
    protected Publisher publisher;
    public abstract void update();
}
