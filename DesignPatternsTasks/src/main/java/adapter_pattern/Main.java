package adapter_pattern;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         * Testing QueueAdapter:
         * I repeated the same procedure for both MyQueue and QueueAdapter.
         * As a result, I got the same outputs.
         */
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        QueueAdapter<String> queueAdapter = new QueueAdapter(arrayList);
        System.out.println(queueAdapter.peek());
        queueAdapter.remove();
        System.out.println(queueAdapter.peek());
        queueAdapter.add("last");
        System.out.println(queueAdapter.peek());
        System.out.println(queueAdapter.remove());
        System.out.println(queueAdapter.remove());
        System.out.println(queueAdapter.remove());
        System.out.println(queueAdapter.remove());
        System.out.println(queueAdapter.add("added"));
        System.out.println(queueAdapter.peek());

        System.out.println("-".repeat(30));

        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("first");
        myQueue.add("second");
        myQueue.add("third");
        System.out.println(myQueue.peek());
        myQueue.remove();
        System.out.println(myQueue.peek());
        myQueue.add("last");
        System.out.println(myQueue.peek());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.add("added"));
        System.out.println(myQueue.peek());

    }

}
