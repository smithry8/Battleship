package BattleShip;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class GUI extends JButton implements ActionListener{
	private static int leftBorderCounter = 0;
	
    public static final void main(String[] args){
        JFrame battleshipFrame = new JFrame("Battleship");
        JPanel emptyButton = new JPanel();
        battleshipFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        battleshipFrame.setSize(600,600);
        battleshipFrame.setLayout(new GridLayout(11,11));

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        for(int i = 0; i < 121; i++){
            if(i == 0) {
                battleshipFrame.add(emptyButton);
                emptyButton.setBackground(new Color(86,125,70));
            }
            else if(i < 11){
                JLabel numberButton = new JLabel(String.valueOf(i), SwingConstants.CENTER);
                numberButton.setBackground(new Color(86,125,70));
                numberButton.setOpaque(true);
                Border border = BorderFactory.createLineBorder(Color.black, 1);
                numberButton.setBorder(border);
                battleshipFrame.add(numberButton);
            }
            else if(i % 11 == 0) {
                JLabel letterButton = new JLabel(String.valueOf(alphabet[leftBorderCounter]), SwingConstants.CENTER);
                letterButton.setBackground(new Color(86,125,70));
                letterButton.setOpaque(true);
                Border border = BorderFactory.createLineBorder(Color.black, 1);
                letterButton.setBorder(border);
                battleshipFrame.add(letterButton);
                leftBorderCounter = leftBorderCounter + 1;
            }
            else {
                JButton shipButton = new JButton();
                shipButton.setBackground(new Color(0,84,119));
                battleshipFrame.add(shipButton);
            }
        }

        battleshipFrame.setVisible(true);

//		JPanel battleshipPanel = new JPanel();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
