/**
 * Created by block7 on 12/13/16.
 */
public class RPNStackItem extends LSStackItem{
    RPNStackItem(String s){
        super(s);
    }

    RPNStackItem(double d){ super(new Double(d).toString()); }

    double getDoubleValue(){
        return Double.valueOf(value);
    }

    int getIntValue(){ return Integer.valueOf(value); }

}
