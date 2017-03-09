import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by block7 on 3/6/17.
 */
public class EightMain {

    public static int N_GAMES;
    public static void main(String[] args){

        String Input = readLine("How many rounds would you like to play?");
        N_GAMES = Integer.parseInt(Input);

        EightGame game = new EightGame();
        int results[] = new int[N_GAMES];

        for (int i = 0; i < N_GAMES; i++) {
            results[i] = game.playRound();
        }
    }

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
}
