package structural.decorator;

/**
 * Created by Administrator on 2020/8/18.
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation(){
        System.out.println("装饰一下");
        super.operation();
    }


}
