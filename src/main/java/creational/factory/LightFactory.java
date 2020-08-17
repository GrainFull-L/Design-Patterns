package creational.factory;

/**
 * Created by Administrator on 2020/8/17.
 */
public class LightFactory implements Factory {
    @Override
    public Product create() {
        Product product = new Light();
        System.out.println("light is create");
        return product;
    }
}
