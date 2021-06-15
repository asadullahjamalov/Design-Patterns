package observer_pattern.subscribers;

import observer_pattern.Publisher;
import observer_pattern.Subscriber;

public class HexDecimalASCIISubscriber extends Subscriber {

    public HexDecimalASCIISubscriber(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Observer 2: " + toHexDecimalASCII(publisher.getState()));
    }

    public static String toHexDecimalASCII(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            sb.append(Integer.toHexString(c)).append(" ");
        }
        return sb.toString();
    }
}
