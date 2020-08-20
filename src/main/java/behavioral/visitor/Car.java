package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2020/8/20.
 */
public class Car{
    private List<Visitable> visitableList = new ArrayList<>();

    public void add(Visitable visitable){
        visitableList.add(visitable);
    }

    public void show(Visitor visitor){
        for(Visitable visitable:visitableList){
            visitable.accept(visitor);
        }
    }

    //被访问对象是相对稳定的，不同访问者有不同的操作  例如：医院收费员、药房工作人员对处方单的不同行为
    public static void main(String[] args) {
        Car car = new Car();
        car.add(new Body());
        car.add(new Engine());

        Visitor visitor = new PrintCar();
        car.show(visitor);

        Visitor visitor1 = new CheckCar();
        car.show(visitor1);
    }
}
