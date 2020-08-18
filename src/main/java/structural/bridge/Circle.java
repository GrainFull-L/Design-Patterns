package structural.bridge;

/**
 * Created by Administrator on 2020/8/18.
 */
public class Circle extends Shape{

    private int x,y,raduis;

    public Circle(int x,int y ,int raduis,DrawAPI api){
        super(api);
        this.x = x;
        this.y =y;
        this.raduis = raduis;
    }

    @Override
    void draw() {
        api.drawCircle(x,y,raduis);
    }
}
