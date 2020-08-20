package behavioral.state;

/**
 * Created by Administrator on 2020/8/20.
 */
public class ManagerState extends State {

    @Override
    public void handle() {
        System.out.println("经理审批通过");
        context.setState(new DirectorState());
    }
}
