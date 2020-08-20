package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2020/8/20.
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private List<T> data = new ArrayList<T>();

    private int cursor = 0;


    public ConcreteIterator(List<T> data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return cursor!=data.size();
    }

    @Override
    public T getNext() {
        T obj = null;
        if(hasNext()){
            obj = data.get(cursor++);
        }
        return obj;
    }
}
