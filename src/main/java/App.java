import creational.abstract_factory.*;
import creational.factory.Factory;
import creational.factory.LightFactory;
import creational.factory.PhoneFactory;
import creational.factory.Product;

/**
 * Created by Administrator on 2020/8/17.
 */
public class App {


    public static void main(String[] args) {
        //factory
//        Factory factory = new PhoneFactory();
        Factory factory = new LightFactory();
        Product product= factory.create();
        product.doing();

        //abstract_factory
//        ComputerFactory computerFactory = new AsusComputerFactory();
        ComputerFactory computerFactory = new HpComputerFactoary();
        CPU cpu= computerFactory.useCPU();
        cpu.working();
        MainBoard mainBoard = computerFactory.useMainBoard();
        mainBoard.working();



    }
}
