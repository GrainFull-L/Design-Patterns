package behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2020/8/20.
 */
public class Context {

    private final Map<String,Integer> valueMap = new HashMap<String,Integer>();

    public void addValue(String key,int value){
        valueMap.put(key,value);
    }

    public int getValue(String key) {
        return valueMap.get(key).intValue();
    }

    //抽象表达式组件  终结符表达式  非终结符表达式   环境角色？
    public static void main(String[] args) {
        Context context = new Context();
        context.addValue("a",6);
        context.addValue("b",7);

        Variable a = new Variable("a");
        Variable b = new Variable("b");
        AbstractExpression expression = new Add(a,b);
        System.out.println(expression.interpreter(context));
    }
}
