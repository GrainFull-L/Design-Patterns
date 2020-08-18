package structural.proxy;

/**
 * Created by Administrator on 2020/8/18.
 */
public class RealSubject implements Subject {
    @Override
    public void working() {
        System.out.println("i am real subject");
    }
}
