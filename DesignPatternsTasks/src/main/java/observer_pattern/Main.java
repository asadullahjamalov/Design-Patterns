package observer_pattern;

import observer_pattern.subscribers.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Testing my Publisher-Subscriber example
         */
        Publisher publisher = new Publisher();

        new DecimalASCIISubscriber(publisher);
        new HexDecimalASCIISubscriber(publisher);
        new ReverseStringSubscriber(publisher);

        System.out.println("State change: Design Patterns - Hoorah");
        publisher.setState("Design Patterns - Hoorah");
    }
}
