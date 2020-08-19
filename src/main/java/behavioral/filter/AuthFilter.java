package behavioral.filter;

/**
 * Created by Administrator on 2020/8/19.
 */
public class AuthFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("auth request = [" + request + "]");
    }
}
