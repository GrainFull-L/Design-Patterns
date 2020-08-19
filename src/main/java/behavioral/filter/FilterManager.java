package behavioral.filter;

/**
 * Created by Administrator on 2020/8/19.
 */
public class FilterManager {
    private  FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public  void addFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void execute(String request){
        filterChain.execute(request);
    }

    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.addFilter(new AuthFilter());
        filterManager.addFilter(new DebugFilter());

        filterManager.execute("过滤器");
    }



}
