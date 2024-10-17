package tkm;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {


    public static void main(String[] args) {

        JFrame window = new JFrame();
        
        window.setLayout(new FlowLayout()); // Main Menu Start
        window.add(new JLabel("Main Menu"));
        JButton startgame = new JButton("Start Game");  
        JButton joingame = new JButton("Join Game");
        JButton exitgame = new JButton("Exit Game");
        window.add(startgame);
        window.add(joingame);
        window.add(exitgame);  // Main Menu End

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Clue-Less");
        
       
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
    }

}
