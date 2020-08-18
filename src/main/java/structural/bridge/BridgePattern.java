package structural.bridge;

/**
 * Created by Administrator on 2020/8/18.
 */
public class BridgePattern {
//    https://www.cnblogs.com/ch-forever/p/11894593.html
    public static void main(String[] args) {
        Shape redCircle = new Circle(10,10,10,new RedCircle());
        Shape greenCircle = new Circle(20,20,20,new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
