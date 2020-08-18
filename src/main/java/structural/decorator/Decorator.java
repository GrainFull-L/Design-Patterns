package structural.decorator;

/**
 * Created by Administrator on 2020/8/18.
 */
public abstract class Decorator implements  Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
