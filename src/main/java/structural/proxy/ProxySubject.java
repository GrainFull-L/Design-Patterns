package structural.proxy;

/**
 * Created by Administrator on 2020/8/18.
 */
public class ProxySubject implements Subject {

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void working() {
        System.out.println("before");
        realSubject.working();
        System.out.println("after");
    }

    public static void main(String[] args) {
        Subject subject = new ProxySubject(new RealSubject());
        subject.working();

//        动态代理 静态代理
    }
}
