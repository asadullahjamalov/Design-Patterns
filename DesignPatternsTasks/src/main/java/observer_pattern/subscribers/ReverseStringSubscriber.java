package observer_pattern.subscribers;

import observer_pattern.Publisher;
import observer_pattern.Subscriber;

public class ReverseStringSubscriber extends Subscriber {

    public ReverseStringSubscriber(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Observer 3: " + toReverseString(publisher.getState()));
    }

    public static String toReverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
