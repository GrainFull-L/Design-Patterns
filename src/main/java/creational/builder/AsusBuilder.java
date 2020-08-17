package creational.builder;

/**
 * Created by Administrator on 2020/8/17.
 */
public class AsusBuilder implements Builder {

    private Computer computer = new Computer();

    @Override
    public Computer construct() {
        computer.setCpu("asus cpu");
        computer.setMainBoard("asus mainboard");
        return computer;
    }
}
