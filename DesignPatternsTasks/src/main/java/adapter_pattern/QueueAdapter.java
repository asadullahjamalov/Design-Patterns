package adapter_pattern;

import java.util.ArrayList;

public class QueueAdapter<T> implements QueueInterface {

    private ArrayList<T> arrayList;

    public QueueAdapter(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean add(Object o) {
        return arrayList.add((T) o);
    }

    @Override
    public T remove() {
        if (!arrayList.isEmpty()){
            T removedElement = arrayList.get(0);
            arrayList.remove(arrayList.get(0));
            return removedElement;
        }else{
            return null;
        }

    }

    @Override
    public T peek() {
        if (!arrayList.isEmpty()){
            return arrayList.get(0);
        }else{
            return null;
        }
    }


}
