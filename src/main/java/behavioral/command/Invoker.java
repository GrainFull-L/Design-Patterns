package behavioral.command;

/**
 * Created by Administrator on 2020/8/19.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call(){
        System.out.println("调用者开始执行命令");
        command.execute();
    }

    public static void main(String[] args) {
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}
