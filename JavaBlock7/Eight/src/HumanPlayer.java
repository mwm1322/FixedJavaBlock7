/**
 * Created by block7 on 3/8/17.
 */
public class HumanPlayer extends Player {
    HumanPlayer(){}

    public int choose(int lastMove){
        String input;
        int choice;

        if (lastMove == 0){
            input = readLine("Your options are 1, 2, or 3");
            choice = Integer.parseInt(input);
            return choice;
        }
        if (lastMove == 1){
            input = readLine("Your options are 2 or 3");
            choice = Integer.parseInt(input);
            return choice;
        }
        if (lastMove == 2){
            input = readLine("Your options are 1 or 3");
            choice = Integer.parseInt(input);
            return choice;
        }
        if (lastMove == 3){
            input = readLine("Your options are 1 or 2");
            choice = Integer.parseInt(input);
            return choice;
        }
        else{return 0;}
    }
}
