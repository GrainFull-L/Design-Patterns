package behavioral.template;

/**
 * Created by Administrator on 2020/8/19.
 */
public class TemplateTwo extends AbstractTemplate {
    @Override
    public void first() {
        System.out.println("two first");
    }

    @Override
    public void second() {
        System.out.println("two second");
    }

    @Override
    public void three() {
        System.out.println("two three");
    }

    public static void main(String[] args) {
        AbstractTemplate one = new TemplateOne();
        one.templateMethod();
        AbstractTemplate two = new TemplateTwo();
        two.templateMethod();

    }
}
