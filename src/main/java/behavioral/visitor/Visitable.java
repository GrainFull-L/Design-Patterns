package behavioral.visitor;

/**
 * Created by Administrator on 2020/8/20.
 */
public interface Visitable {
    void accept(Visitor visitor);
}
