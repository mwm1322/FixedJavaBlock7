/**
 * Created by block7 on 12/16/16.
 */
public class RPNExponentOperator extends RPNOperator {

    public RPNExponentOperator(){
        super("^",2);
    }

    public void evaluate(RPNStack stack){
        RPNStackItem item1 = stack.pop();
        RPNStackItem item2 = stack.pop();

        double d1 = item1.getDoubleValue();
        double d2 = item2.getDoubleValue();
        double holder = 1;
        for (int i =0; i < d1; i++){
            holder = holder * d2;
        }
        stack.push(new RPNStackItem(holder));

    }
}
