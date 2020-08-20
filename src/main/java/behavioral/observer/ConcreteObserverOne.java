package behavioral.observer;

/**
 * Created by Administrator on 2020/8/20.
 */
public class ConcreteObserverOne implements Observer {
    @Override
    public void response() {
        System.out.println("one observer is working ");
    }
}
