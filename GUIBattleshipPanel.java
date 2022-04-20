import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.Border;

public class GUIBattleshipPanel extends JPanel{
        JButton placementButton;
        JLabel emptyButton, numberButton, letterButton;
        JPopupMenu placeCarrier;
        JFrame gameFrame;
        JPanel gamePanel;
        
    public void initializeGame(){
        gameFrame = new JFrame();
        gameFrame.setTitle("Battleship");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize(800,800);

        gamePanel = new JPanel(new GridLayout(11,11));
       
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        int numberButtonCounter = 1;
        int letterButtonCounter = 0;
        int placementButtonCounter = 0;
        int b = 0;

        for(int i = 0; i < 121; i++){
            if(i == 0) {
                emptyButton = new JLabel("");
                gamePanel.add(emptyButton);
                emptyButton.setBackground(new Color(86,125,70));
                emptyButton.setOpaque(true);
                Border border = BorderFactory.createLineBorder(Color.black, 1);
                emptyButton.setBorder(border);
            }
            else if(i < 11){
                numberButton = new JLabel(String.valueOf(numberButtonCounter), SwingConstants.CENTER);
                numberButtonCounter++;
                numberButton.setBackground(new Color(86,125,70));
                numberButton.setOpaque(true);
                Border border = BorderFactory.createLineBorder(Color.black, 1);
                numberButton.setBorder(border);
                gamePanel.add(numberButton);
            }
            else if(i % 11 == 0) {
                letterButton = new JLabel(String.valueOf(alphabet[letterButtonCounter]), SwingConstants.CENTER);
                letterButtonCounter++;
                letterButton.setBackground(new Color(86,125,70));
                letterButton.setOpaque(true);
                Border border = BorderFactory.createLineBorder(Color.black, 1);
                letterButton.setBorder(border);
                gamePanel.add(letterButton);
            }
            else{
                if(placementButtonCounter == 10){
                    placementButtonCounter = 0;
                }
                placementButton = new JButton(alphabet[letterButtonCounter - 1] + " " + placementButtonCounter);
                placementButtonCounter++;
                placementButton.setBackground(new Color(0,84,119));
                placementButton.setOpaque(true);
                Border border = BorderFactory.createLineBorder(Color.black, 1);
                placementButton.setBorder(border);
                gamePanel.add(placementButton);
            }
        }
        gameFrame.add(gamePanel);
        gameFrame.setVisible(true);
    }

    public void placeShip(){
        
        
    }
}
