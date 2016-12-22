/**
 * Created by block7 on 12/16/16.
 */
public class RPNModuloOperator extends RPNOperator {

    public RPNModuloOperator(){
        super("%",2);
    }

    public void evaluate(RPNStack stack){
        RPNStackItem item1 = stack.pop();
        RPNStackItem item2 = stack.pop();

        double d1 = item1.getDoubleValue();
        double d2 = item2.getDoubleValue();

        double answer = d2 % d1;

        stack.push(new RPNStackItem(answer));
    }
}
