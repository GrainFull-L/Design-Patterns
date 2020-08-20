package behavioral.visitor;

/**
 * Created by Administrator on 2020/8/20.
 */
public class Engine implements Visitable{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
