package creational.abstract_factory;

/**
 * Created by Administrator on 2020/8/17.
 */
public class AsusComputerFactory implements ComputerFactory {
    @Override
    public CPU useCPU() {
        CPU cpu = new AsusCPU();
        System.out.println("asus cpu is create");
        return cpu;
    }

    @Override
    public MainBoard useMainBoard() {
        MainBoard mainBoard = new AsusMainBoard();
        System.out.println("asus mainBoard is create");
        return mainBoard;
    }
}
