package behavioral.visitor;

/**
 * Created by Administrator on 2020/8/20.
 */
public interface Visitor {
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
}
