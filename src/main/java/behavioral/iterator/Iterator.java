package behavioral.iterator;

/**
 * Created by Administrator on 2020/8/20.
 */
public interface Iterator<T> {
    boolean hasNext();

    T getNext();
}
