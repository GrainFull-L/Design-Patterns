package behavioral.memento;

/**
 * Created by Administrator on 2020/8/20.
 */
public class Role {
    private int bloodFlow;
    private int magicPoint;

    public Role(int bloodFlow, int magicPoint) {
        this.bloodFlow = bloodFlow;
        this.magicPoint = magicPoint;
    }

    public int getBloodFlow() {
        return bloodFlow;
    }

    public void setBloodFlow(int bloodFlow) {
        this.bloodFlow = bloodFlow;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    public void display(){
        System.out.println("用户当前状态:");
        System.out.println("血量:"+getBloodFlow()+"蓝量:"+getMagicPoint());
    }

    public Memento save(){
        return new Memento(getBloodFlow(),getMagicPoint());
    }

    public void restore(Memento memento){
        this.bloodFlow = memento.getBloodFlow();
        this.magicPoint = memento.getMagicPoint();
    }
}
