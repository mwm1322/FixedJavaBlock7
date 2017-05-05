/**
 * Created by block7 on 4/27/17.
 */
public class ComputerPlayer {

    public GridBoard board;

    public ComputerPlayer(GridBoard aBoard){
        board = aBoard;
    }

    public void updateBoard(GridBoard aBoard){
        board = aBoard;
        board.check();
    }
}
