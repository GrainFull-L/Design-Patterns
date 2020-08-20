package behavioral.iterator;

/**
 * Created by Administrator on 2020/8/20.
 */
public interface Container<T> {
    void add(T obj);

    void remove(T obj);

    Iterator<T> iterator();
}
