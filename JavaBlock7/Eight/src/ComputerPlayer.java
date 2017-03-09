/**
 * Created by block7 on 3/8/17.
 */
public class ComputerPlayer extends Player {
    ComputerPlayer(){}

    public int choose(int lastMove) {
        int choice;
        int options[] = new int[2];

        if (lastMove == 0){
            choice = (int) (Math.random() * 2 + 1);
            return choice;
        }
        if (lastMove == 1){
            options[0] = 2;
            options[1] = 3;
            choice = (int) (Math.random() + 0.5);
            choice = options[choice];
            return choice;
        }
        if (lastMove == 2){
            options[0] = 1;
            options[1] = 3;
            choice = (int) (Math.random() + 0.5);
            choice = options[choice];
            return choice;
        }
        if (lastMove == 3){
            options[0] = 1;
            options[1] = 2;
            choice = (int) (Math.random() + 0.5);
            choice = options[choice];
            return choice;
        }
        else{return 0;}
    }
}
