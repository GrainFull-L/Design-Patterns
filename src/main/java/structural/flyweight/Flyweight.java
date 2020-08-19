package structural.flyweight;

/**
 * Created by Administrator on 2020/8/19.
 */
public class Flyweight {
    public static void main(String[] args) {
//        Integer a  = new Integer(123);
//        Integer b  = new Integer(123);
//        System.out.println(a==b);
//
//        Integer c = Integer.valueOf(123);
//        Integer d = Integer.valueOf(123);
//        System.out.println(c==d);

//        Integer e = Integer.valueOf(128);
//        Integer f = Integer.valueOf(128);
//        System.out.println(e==f);

        //截断至8位  原码第一位是符号位    数值用补码表示

        byte a = (byte) 137;
        Byte e = Byte.valueOf(a);
        Byte f = Byte.valueOf(a);
        System.out.println(e==f);
    }
}
