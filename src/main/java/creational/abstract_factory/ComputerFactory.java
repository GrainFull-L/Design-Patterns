package creational.abstract_factory;

/**
 * Created by Administrator on 2020/8/17.
 */
public interface ComputerFactory {

    /**
     * 使用哪个CPU
     * @return
     */
    CPU useCPU();

    /**
     * 使用哪个主板
     * @return
     */
    MainBoard useMainBoard();
}
