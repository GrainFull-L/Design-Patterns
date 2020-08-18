package structural.bridge;

/**
 * Created by Administrator on 2020/8/18.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println(" green x = [" + x + "], y = [" + y + "], radius = [" + radius + "]");
    }
}
