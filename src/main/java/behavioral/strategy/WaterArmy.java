package behavioral.strategy;

/**
 * Created by Administrator on 2020/8/19.
 */
public class WaterArmy implements IncreaseFansStrategy {
    @Override
    public void action() {
        System.out.println("招一群水军");
    }
}
