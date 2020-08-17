package creational.singleton;

/**
 * Created by Administrator on 2020/8/17.
 */
public class Singleton {

    //饿汉 懒汉 double check  枚举
    //TODO

    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getIntance(){
        return singleton;
    }
}
