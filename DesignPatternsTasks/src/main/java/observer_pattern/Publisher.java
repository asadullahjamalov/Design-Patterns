package observer_pattern;

import java.util.LinkedList;
import java.util.List;

public class Publisher {

    private List<Subscriber> subscribers = new LinkedList<>();
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        this.notifyAllSubscribers();
    }

    public void attach(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void notifyAllSubscribers(){
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }
}