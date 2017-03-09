/**
 * Created by block7 on 12/13/16.
 */
public class RPNStack extends LSStack{

    public  RPNStackItem pop(){
        return (RPNStackItem) super.pop();
    }

    public void push(String s){
        if(RPNMain.operatorMap.containsKey(s)){
            RPNOperator op = RPNMain.operatorMap.get(s);
            op.evaluate(this);
        } else {
            try{
                double d= Double.valueOf(s);
                push(new RPNStackItem(s));
            }
            catch (NumberFormatException ex) {
                System.out.println("Invalid token" + s);
                System.exit(-1);
            }
        }
    }
}
