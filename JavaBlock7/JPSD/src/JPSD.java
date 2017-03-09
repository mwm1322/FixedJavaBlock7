import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by block7 on 11/28/16.
 */
public class JPSD {
    public static String readLine(String prompt) {
        String line = null;
        Console c = System.console();
        if (c != null) {
            line = c.readLine(prompt);
        } else {
            System.out.print(prompt);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                line = bufferedReader.readLine();
            } catch (IOException e) {
                //Ignore
            }
        }
        return line;
    }

    public static void main(String[] args){
        String input = readLine("What would you like to do?" +
                "\n Fibonacci: Input 1" +
                "\n Pyramid: Input 2" +
                "\n Sum: Input 3" +
                "\n Even/Odd checker: Input 4 " +
                "\n Number line: Input 5");
        int choice = Integer.parseInt(input);
        if (choice == 1){fibonacci();}
        if (choice == 2){pyramid();}
        if (choice == 3){sum();}
        if (choice == 4){numberType();}
        if (choice == 5){numberLine();}
        String[] a = {};
        main(a);
    }

    static void fibonacci(){
        String input = readLine("Which Fibonacci number do you want?");
        int n = Integer.parseInt(input);
        int fibPrev = 0;
        int fibNow = 1;
        int holder;
        for(int i = 1; i < n; i++){
            holder = fibNow;
            fibNow = fibPrev + fibNow;
            fibPrev = holder;
        }
        System.out.println(fibNow);
    }

    static void pyramid(){
        String input = readLine("How tall would you like your pyramid?");
        int height = Integer.parseInt(input);
        for (int i = 0; i < height; i++){
            for (int a = 0; a < i; a++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = height; i > 0; i--){
            for (int a = 0; a < i; a++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void sum(){
        String input1 = readLine("What is the first number you would like to add?");
        String input2 = readLine("What is the second number you would like to add?");
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        System.out.println(num1 + num2);
    }

    static void numberType(){
        String input = readLine("What number would you like to check?");
        int num = Integer.parseInt(input);
        if (num % 2 == 0){
            System.out.println(num + " is an even number");
        }
        else {
            System.out.println(num + " is an odd number");
        }
        System.out.println(num);
    }

    static void numberLine(){
        String input = readLine("How many numbers do you want in your number line?");
        int n = Integer.parseInt(input);
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ",");
        }
    }

}
