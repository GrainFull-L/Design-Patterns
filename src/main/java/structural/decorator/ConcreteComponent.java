package structural.decorator;

/**
 * Created by Administrator on 2020/8/18.
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具像的类");
    }

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component component1 = new ConcreteDecorator(component);
        component1.operation();
    }
}
