package tkm;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {


    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setLayout(new FlowLayout());
        
        // Main Menu Start
        MainMenu mainMenu = new MainMenu();
        JPanel mainMenuPanel = mainMenu.createMainMenu();
        window.add(mainMenuPanel);
        // Main Menu End

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
