package behavioral.strategy;

/**
 * Created by Administrator on 2020/8/19.
 */
public class Context {

    private IncreaseFansStrategy increaseFansStrategy;

    public void setIncreaseFansStrategy(IncreaseFansStrategy increaseFansStrategy) {
        this.increaseFansStrategy = increaseFansStrategy;
    }

    public void execu(){
        increaseFansStrategy.action();
    }

    public static void main(String[] args) {
        Context context = new Context();
        context.setIncreaseFansStrategy(new OriginalArticle());
        context.execu();

        context.setIncreaseFansStrategy(new WaterArmy());
        context.execu();



    }
}
