/**
 * Created by block7 on 12/15/16.
 */
public class RPNDivideOperator extends RPNOperator{
    public RPNDivideOperator(){
        super("/", 2);
    }

    public void evaluate(RPNStack stack){
        RPNStackItem item1 = stack.pop();
        RPNStackItem item2 = stack.pop();

        double d1 = item1.getDoubleValue();
        double d2 = item2.getDoubleValue();
        double result = d2 / d1;
        stack.push(new RPNStackItem(result));
    }
}
