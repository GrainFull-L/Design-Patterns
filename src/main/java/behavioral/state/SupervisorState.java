package behavioral.state;

/**
 * Created by Administrator on 2020/8/20.
 */
public class SupervisorState extends State {
    @Override
    public void handle() {
        System.out.println("主管审批通过");
        context.setState(new ManagerState());
    }
}
