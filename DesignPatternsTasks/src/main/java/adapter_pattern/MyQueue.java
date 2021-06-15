package adapter_pattern;

public class MyQueue<T> implements QueueInterface{

    private Node firstNode;
    private int size;

    public MyQueue() {
        firstNode = new Node(null);
        size = 0;
    }

    public boolean add(Object item) {
        Node newNode = new Node(item);
        Node current = firstNode;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
        size++;
        return true;
    }

    public T remove() {
        if (size > 0) {
            Node current = firstNode;
            Node<T> deletedNode = current.getNext();
            firstNode = current.getNext();
            size--;
            return deletedNode.getValue();
        } else {
//            System.out.println("There is no element to remove ");
            return null;
        }
    }

    public T peek() {
        if (size > 0) {
            return (T) firstNode.getNext().getValue();
        } else {
//            System.out.println("There is no element to peek ");
            return null;
        }

    }

}
