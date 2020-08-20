package behavioral.mediator;

/**
 * Created by Administrator on 2020/8/20.
 */
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }
    public void constact(String message){
        mediator.constact(message,this);
    }

    public void getMessage(String message){
        System.out.println("租客:"+name+" 获得消息: "+message);
    }

}
