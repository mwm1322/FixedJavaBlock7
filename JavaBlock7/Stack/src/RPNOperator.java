/**
 * Created by block7 on 12/13/16.
 */
public abstract class RPNOperator {
    String name;
    int numberOfOperands;

    RPNOperator(String s, int n){
        name = s;
        numberOfOperands = n;
    }



    abstract void evaluate(RPNStack stack);
}
