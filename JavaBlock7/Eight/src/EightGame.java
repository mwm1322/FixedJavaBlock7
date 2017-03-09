/**
 * Created by block7 on 3/6/17.
 */
public class EightGame {

    HumanPlayer human = new HumanPlayer();
    ComputerPlayer computer = new ComputerPlayer();

    EightGame(){}

    int playRound(){

        boolean isGameRunning = true;
        int total = 0;
        int lastPick = 0;
        int holder;
        boolean lastMoved = true;

        while (isGameRunning) {
            if (total < 8) {

                holder = human.choose(lastPick);
                total = total + holder;
                lastPick = holder;
                lastMoved = true;
                System.out.println("The total is " + total + " It is the computer's turn.");

                if (total >= 8){
                    if (total == 8) {
                        if (lastMoved == true) {
                            System.out.println("Game over: The total is " + total);
                            System.out.println("Human Wins");
                            return 0;
                        }
                        if (lastMoved == false) {
                            System.out.println("Game over: The total is " + total);
                            System.out.println("Computer Wins");
                            return 1;
                        }
                    }

                    if (total > 8) {
                        if (lastMoved == true) {
                            System.out.println("Game over: The total is " + total);
                            System.out.println("Computer Wins");
                            return 1;
                        }
                        if (lastMoved == false) {
                            System.out.println("Game over: The total is " + total);
                            System.out.println("Human Wins");
                            return 0;
                        }
                    }
                }

                holder = computer.choose(lastPick);
                total = total + holder;
                lastPick = holder;
                lastMoved = false;
                System.out.println("The total is " + total + " It is the human's turn.");

                if (total >= 8){
                    if (total == 8) {
                        if (lastMoved == true) {
                            System.out.println("Game over: The total is " + total);
                            System.out.println("Human Wins");
                            return 0;
                        }
                        if (lastMoved == false) {
                            System.out.println("Game over: The total is " + total);
                            System.out.println("Computer Wins");
                            return 1;
                        }
                    }

                    if (total > 8) {
                        if (lastMoved == true) {
                            System.out.println("Game over: The total is " + total);
                            System.out.println("Computer Wins");
                            return 1;
                        }
                        if (lastMoved == false) {
                            System.out.println("Game over: The total is " + total);
                            System.out.println("Human Wins");
                            return 0;
                        }
                    }
                }
            }
        }

//        if (total == 8) {
//            if (lastMoved == true) {
//                return 0;
//            }
//            if (lastMoved == false) {
//                return 1;
//            }
//        }
//
//        if (total > 8) {
//            if (lastMoved == true) {
//                return 1;
//            }
//            if (lastMoved == false) {
//                return 0;
//            }
//        }

        return 0;
    }
}
