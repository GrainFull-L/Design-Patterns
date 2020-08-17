package creational.builder;

/**
 * Created by Administrator on 2020/8/17.
 */
public class Director {
    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public Computer init(){
        return builder.construct();
    }

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new AsusBuilder());
        Computer computer = director.init();
        System.out.println(computer.getCpu());
        System.out.println(computer.getMainBoard());
    }

}
