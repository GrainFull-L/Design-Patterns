package behavioral.state;

/**
 * Created by Administrator on 2020/8/20.
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void request(){
        state.handle();
    }
}
