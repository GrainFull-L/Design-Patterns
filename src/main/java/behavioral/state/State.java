package behavioral.state;

/**
 * Created by Administrator on 2020/8/20.
 */
public abstract class State {
    protected Context context;

    public abstract void handle();

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
