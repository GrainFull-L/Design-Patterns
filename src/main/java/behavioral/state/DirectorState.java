package behavioral.state;

/**
 * Created by Administrator on 2020/8/20.
 */
public class DirectorState extends State {
    @Override
    public void handle() {
        System.out.println("审批完成");
    }

    public static void main(String[] args) {
        Context context  =new Context();
        context.setState(new SupervisorState());
        context.request();
        context.request();
        context.request();

    }
}
