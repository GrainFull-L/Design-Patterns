package behavioral.mediator;

/**
 * Created by Administrator on 2020/8/20.
 */
public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message){
        mediator.constact(message,this);
    }

    public void getMessage(String message){
        System.out.println("房主:"+name+" 获得消息: "+message);
    }

}
