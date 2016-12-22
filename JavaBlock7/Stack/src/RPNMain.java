import java.util.Scanner;
import java.util.HashMap;

/**
 * Created by block7 on 12/13/16.
 */
public class RPNMain {

    static HashMap<String, RPNOperator> operatorMap;
    static RPNStack myStack = new RPNStack();

    public static String readLine(String prompt){
        System.out.print(prompt);
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        return s;
    }

    public static String[] getTokens(String s) {return s.split(" ");}

    public static void processRPNInput(){
        String[] tokens = getTokens(readLine(": "));
        for (String t : tokens){
            myStack.push(t);
        }
        myStack.printStack();
    }

    public static void main(String[] args){
        operatorMap = new HashMap<String, RPNOperator>();

        RPNOperator addOp = new RPNAddOperator();
        RPNOperator subOp = new RPNSubtractOperator();
        RPNOperator mulOp = new RPNMultiplyOperator();
        RPNOperator divOp = new RPNDivideOperator();
        RPNOperator expOp = new RPNExponentOperator();
        RPNOperator facOp = new RPNFactorialOperator();
        RPNOperator modOp = new RPNModuloOperator();


        operatorMap.put("+",addOp);
        operatorMap.put("-",subOp);
        operatorMap.put("*",mulOp);
        operatorMap.put("/",divOp);
        operatorMap.put("^",expOp);
        operatorMap.put("!",facOp);
        operatorMap.put("%",modOp);


        processRPNInput();
    }
}
