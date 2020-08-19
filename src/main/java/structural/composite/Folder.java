package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2020/8/19.
 * 容器组件
 */
public class Folder extends Component {
    private String name;
    private List<Component> components = new ArrayList<Component>();
    private Integer level;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getContent() {
        return super.getContent();
    }

    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void remove(Component c) {
        components.remove(c);
    }

    @Override
    public void print() {
        System.out.println(this.getName());
        if (this.level == null) {
            this.level = 1;
        }
        String prefix = "";
        for (int i = 0; i < this.level; i++) {
            prefix += "\t- ";
        }
        for (Component component : components) {
//            if (component instanceof Folder){
//                ((Folder)component).level = this.level + 1;
//            }
            System.out.print(prefix);
            component.print();
        }
//        this.level = null;
    }

    public static void main(String[] args) {
        Folder folder = new Folder("1号文件夹");
        Folder folder1 = new Folder("2号文件夹");

        File file = new File("小说","秦时明月");
        folder.add(file);
        folder.add(folder1);
        folder.print();


    }
}
