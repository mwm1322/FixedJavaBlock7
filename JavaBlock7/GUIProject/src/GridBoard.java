/**
 * Created by block7 on 3/22/17.
 */
import javax.swing.*;
import java.awt.GridLayout;
import javax.swing.border.Border;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;


public class GridBoard{

    ComputerPlayer computerPlayer = new ComputerPlayer(this);
    JFrame frame = new JFrame();
    JPanel mainPanel = new JPanel();
    JPanel[][] grid;
    static  TicTacPanel [][] grid2;
    JPanel smallPanel = new JPanel();
    JPanel textPanel = new JPanel();
    static char[][] points = new char[3][3];
    public class TicTacPanel {
        String choice;
        JPanel panel;
    }

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JRadioButton btn = (JRadioButton) e.getSource();
            System.out.println("Selected Button = " + btn.getName());

            char [] a = btn.getName().toCharArray();
            for(char s: a) {
                System.out.println(s);
            }
            System.out.println( a[1] );
            points[ Character.getNumericValue( a[0] ) ][ Character.getNumericValue( a[1])] = a[2];

            //System.out.println("human turn taken");
            //updateComputerPlayer();

            //btn.setEnabled(false);
        }
    };

    public void updateComputerPlayer(){
        computerPlayer.updateBoard(this);
    }

    public void hasAccess(){
        System.out.print("");
    }

    public GridBoard(int width, int length){


        computerPlayer = new ComputerPlayer(this);
        smallPanel.setLayout(new GridLayout(width,length));
        grid2 = new TicTacPanel[width][length];
        grid = new JPanel[width][length];
        ButtonGroup bg = new ButtonGroup();
        for(int y=0; y<length; y++){
            for(int x=0; x<width; x++){

                JRadioButton radioX = new JRadioButton("X");
                JRadioButton radioO = new JRadioButton("O");
                JRadioButton radioEmpty = new JRadioButton("-");
                ButtonGroup group = new ButtonGroup();
                group.add(radioX);
                group.add(radioO);
                group.add(radioEmpty);
                radioEmpty.setSelected(true);
                radioO.addActionListener(listener);
                radioO.setName(x +""+ y + "O");
                radioX.addActionListener(listener);
                radioX.setName(x  +""+ y + "X");
                radioEmpty.addActionListener(listener);
                radioEmpty.setName(x +""+ y + "Empty");
                TicTacPanel object = new TicTacPanel();
                JPanel panel = new JPanel();

                panel.setBorder(BorderFactory.createLineBorder(Color.black));
                panel.add(radioX);
                panel.add(radioO);
                panel.add(radioEmpty);

                object.panel = panel;

                grid2[x][y]= object;
                smallPanel.add(grid2[x][y].panel);


            }

        }

        mainPanel.add(smallPanel);
        textPanel.add(new JLabel("Welcome to Tic Tac Toe!"));
        mainPanel.add(textPanel);
        frame.add(mainPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        check();
    }
    public static void check() {
        //  System.out.println(points[0][0] + "hey" );
        for(int y=0; y<3; y++) {
            for (int x = 0; x < 3; x++) {
                if( points[x][y] !='\u0000') {
                    grid2[x][y].panel.setEnabled(false);
                }
            }
        }
        while(0 == 0) {
            if (points[0][0] == (points[0][1]) && points[0][0] == points[0][2] && points[0][0]!= '\u0000') {
                System.out.println(points[0][0] + " wins");
                return;
            }
            if (points[1][0] == (points[1][1]) && points[1][0] == points[1][2] && points[1][0]!= '\u0000') {
                System.out.println(points[1][0] + " wins");
                return;
            }
            if (points[2][0] == (points[2][1]) && points[2][0] == points[2][2] && points[2][0]!= '\u0000') {
                System.out.println(points[2][0] + " wins");
                return;
            }
            if (points[0][0] == (points[1][0]) && points[0][0] == points[2][0] && points[0][0]!= '\u0000') {
                System.out.println(points[0][0] + " wins");
                return;
            }
            if (points[0][1] == (points[1][1]) && points[0][1] == points[2][1] && points[0][1]!= '\u0000') {
                System.out.println(points[0][1] + " wins");
                return;
            }
            if (points[0][2] == (points[1][2]) && points[0][2] == points[2][2] && points[0][2]!= '\u0000') {
                System.out.println(points[0][2] + " wins");
                return;
            }
            if (points[0][0] == (points[1][1]) && points[0][0] == points[2][2] && points[0][0]!= '\u0000') {
                System.out.println(points[0][0] + " wins");
                return;
            }
            if (points[0][2] == (points[1][1]) && points[0][2] == points[2][0] && points[0][2]!= '\u0000') {
                System.out.println(points[0][2] + " wins");
                return;
            }

        }
    }

    public static void main(String[] args) {
        new GridBoard(3 , 3);


//        for(int i = 0; i < 3; i++) {
//                for(int z = 0; z < 3; i++){
//                    System.out.println(points[i][z]);
//                }
//
//            }
    }
}