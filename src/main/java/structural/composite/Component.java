package structural.composite;

/**
 * Created by Administrator on 2020/8/19.
 */
public abstract class Component {

    public String getName(){
        throw new UnsupportedOperationException("不支持该操作");
    }

    public String getContent(){
        throw  new UnsupportedOperationException("不支持获取内容");
    }

    public void add(Component c){
        throw new UnsupportedOperationException("不支持添加");
    }

    public void remove(Component c){
        throw new UnsupportedOperationException("不支持移除");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印");
    }


}
