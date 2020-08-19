package structural.facade;

/**
 * Created by Administrator on 2020/8/18.
 */
public class ComputerFacade {

    private Cpu cpu = new Cpu();

    private Disk disk = new Disk();

    public void startUp(){
        cpu.startUp();
        disk.statUp();
    }

    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        facade.startUp();
    }
}
