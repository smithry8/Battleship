package BattleShip;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;

public class GUI{
	private static int a = 0;
	
	public static Icon resizeIcon(ImageIcon icon, int width, int height) {
		Image originalImage = icon.getImage();
		Image resizedImage = originalImage.getScaledInstance(width, height, java.awt.Image.SCALE_DEFAULT);
		return new ImageIcon(resizedImage);
	}
	
    public static final void main(String[] args){
        JFrame battleshipFrame = new JFrame("Battleship");
        JPanel emptyButton = new JPanel();
        ImageIcon smallShip = new ImageIcon("Small ship.png");
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
                JLabel letterButton = new JLabel(String.valueOf(alphabet[a]), SwingConstants.CENTER);
                letterButton.setBackground(new Color(86,125,70));
                letterButton.setOpaque(true);
                Border border = BorderFactory.createLineBorder(Color.black, 1);
                letterButton.setBorder(border);
                battleshipFrame.add(letterButton);
                a = a + 1;
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
}
