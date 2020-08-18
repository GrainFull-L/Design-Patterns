package structural.bridge;

/**
 * Created by Administrator on 2020/8/18.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("red x = [" + x + "], y = [" + y + "], radius = [" + radius + "]");
    }
}
