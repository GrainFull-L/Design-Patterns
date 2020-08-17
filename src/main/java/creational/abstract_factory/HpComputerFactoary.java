package creational.abstract_factory;

/**
 * Created by Administrator on 2020/8/17.
 */
public class HpComputerFactoary implements ComputerFactory {
    @Override
    public CPU useCPU() {
        CPU cpu = new HpCPU();
        System.out.println("hp cpu is create");
        return cpu;
    }

    @Override
    public MainBoard useMainBoard() {
        MainBoard mainBoard = new HpMainBoard();
        System.out.println("hp mainBoard is create");
        return mainBoard;
    }
}
