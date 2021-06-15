package observer_pattern.subscribers;

import observer_pattern.Publisher;
import observer_pattern.Subscriber;

public class DecimalASCIISubscriber extends Subscriber {

    public DecimalASCIISubscriber(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Observer 1: " + toDecimalASCII(publisher.getState()));
    }

    public static String toDecimalASCII(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            sb.append((int) c).append(" ");
        }
        return sb.toString();
    }
}