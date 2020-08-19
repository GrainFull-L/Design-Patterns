package structural.composite;

/**
 * Created by Administrator on 2020/8/19.
 * 具像组件
 */
public class File extends Component {
    private String name;
    private String content;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getContent() {
        return content;
    }


    @Override
    public void print() {
        System.out.println(name);
    }

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }
}
