/**
 * Created by block7 on 12/16/16.
 */
public class RPNFactorialOperator extends RPNOperator {

    public RPNFactorialOperator(){
        super("!",1);
    }

    public void evaluate(RPNStack stack){
        RPNStackItem item = stack.pop();

        double d = item.getIntValue();
        double holder = 1;

        for(int i = 0; i < d; i++){
            holder = holder * (d - i);
        }
        stack.push(new RPNStackItem(holder));
    }
}
