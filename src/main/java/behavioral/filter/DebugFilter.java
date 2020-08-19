package behavioral.filter;

/**
 * Created by Administrator on 2020/8/19.
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("debug request = [" + request + "]");
    }
}
