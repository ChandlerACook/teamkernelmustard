package tkm;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu {

    public JPanel createMainMenu() {

        JPanel mainMenuPanel = new JPanel();
        mainMenuPanel.setLayout(new FlowLayout());

        JLabel mainMenuLabel = new JLabel("Main Menu");

        JButton startGameButton = new JButton("Start Game");
        JButton joinGameButton = new JButton("Join Game");
        JButton quitGameButton = new JButton("Quit Game");

        mainMenuPanel.add(mainMenuLabel);
        mainMenuPanel.add(startGameButton);
        mainMenuPanel.add(joinGameButton);
        mainMenuPanel.add(quitGameButton);

        return mainMenuPanel;
        
    }
   
}