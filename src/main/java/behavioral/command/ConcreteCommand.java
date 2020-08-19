package behavioral.command;

/**
 * Created by Administrator on 2020/8/19.
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
