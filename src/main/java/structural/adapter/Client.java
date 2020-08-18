package structural.adapter;

/**
 * Created by Administrator on 2020/8/18.
 */
public class Client {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
