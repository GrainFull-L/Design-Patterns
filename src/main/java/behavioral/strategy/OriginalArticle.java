package behavioral.strategy;

/**
 * Created by Administrator on 2020/8/19.
 */
public class OriginalArticle implements IncreaseFansStrategy {
    @Override
    public void action() {
        System.out.println("坚持写原创文章");
    }
}
