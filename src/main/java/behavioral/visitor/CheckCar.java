package behavioral.visitor;

/**
 * Created by Administrator on 2020/8/20.
 */
public class CheckCar implements Visitor {
    @Override
    public void visit(Engine engine) {
        System.out.println(" check car engine");
    }

    @Override
    public void visit(Body body) {
        System.out.println(" check car body");
    }

    @Override
    public void visit(Car car) {
        System.out.println(" check car car");
    }
}
