package adapter_pattern;

public interface QueueInterface <T>{
    boolean add(T t);
    T remove();
    T peek();
}
