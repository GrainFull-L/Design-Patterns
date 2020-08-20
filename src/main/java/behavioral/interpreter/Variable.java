package behavioral.interpreter;

/**
 * Created by Administrator on 2020/8/20.
 */
public class Variable extends AbstractExpression {

    private final String key;

    public Variable(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Context context) {
        return context.getValue(key);
    }
}
