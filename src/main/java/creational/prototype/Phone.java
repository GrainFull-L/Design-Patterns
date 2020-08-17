package creational.prototype;

/**
 * Created by Administrator on 2020/8/17.
 */
public class Phone implements Prototype {
    @Override
    public Prototype clone() {
        Phone phone = new Phone();
        return phone;
    }
}
