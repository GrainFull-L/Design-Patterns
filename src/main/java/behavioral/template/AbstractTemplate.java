package behavioral.template;

/**
 * Created by Administrator on 2020/8/19.
 */
public abstract class AbstractTemplate {
    public void first() {

    }

    public void second(){
    }

    public void three(){

    }

    public final void templateMethod(){
        first();
        second();
        three();
    }


}
