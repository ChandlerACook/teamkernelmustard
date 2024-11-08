
package tkm;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @file PlayerOptionsPanel.java
 * @date 10/20/2024
 * @author Mike
 * 
 * This is a UI panel that has buttons for player options during the game. They are
 * "Move", "Suggest", "Accusation".
 * 
 * TO DO
 * Add Exit Game, and View Rules
 */
public class PlayerOptionsPanel extends JPanel {
    
    private JButton move;
    private JButton suggest;
    private JButton accuse;
    
    public PlayerOptionsPanel() {
        this.initComponents();
        
        this.setLayout(new GridLayout(0, 1, 5, 5));
        
        this.add(move);
        this.add(suggest);
        this.add(accuse);
    }
    
    private void initComponents() {
        move = new JButton("Move Character");
        suggest = new JButton("Make a Suggestion");
        accuse = new JButton("Make Accusation");
    }
    
}