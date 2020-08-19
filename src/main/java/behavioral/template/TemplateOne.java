package behavioral.template;

/**
 * Created by Administrator on 2020/8/19.
 */
public class TemplateOne extends AbstractTemplate {
    @Override
    public void first() {
        System.out.println("one first");
    }

    @Override
    public void second() {
        System.out.println("one second");
    }

    @Override
    public void three() {
        System.out.println("one three");
    }
}
