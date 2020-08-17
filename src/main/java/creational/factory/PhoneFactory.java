package creational.factory;

/**
 * Created by Administrator on 2020/8/17.
 */
public class PhoneFactory implements Factory {
    @Override
    public Product create() {
        Product product = new Phone();
        System.out.println("PhoneFactory create a phone");
        return product;
    }
}
