package structural.bridge;

/**
 * Created by Administrator on 2020/8/18.
 */
public abstract class Shape {
    protected DrawAPI api;

    protected Shape(DrawAPI api){
        this.api = api;
    }

    abstract  void draw();
}
