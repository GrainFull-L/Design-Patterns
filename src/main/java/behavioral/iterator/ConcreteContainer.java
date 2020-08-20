package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2020/8/20.
 */
public class ConcreteContainer<T> implements  Container<T> {

    private List<T> data  = new ArrayList<T>();

    @Override
    public void add(T obj) {
        data.add(obj);
    }

    @Override
    public void remove(T obj) {
        data.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(data);
    }

    public static void main(String[] args) {
        ConcreteContainer<String> datas =  new ConcreteContainer<>();
        datas.add("a");
        datas.add("b");
        datas.add("c");
        Iterator<String> iterator = datas.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getNext());
        }


    }
}
