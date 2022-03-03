package BattleShip;

import java.util.Scanner;
import java.util.Random;

public class GameBoardTerminal {

	Scanner scan = new Scanner(System.in);
	private char coords_input;
	private Board playerField = new Board();
	private Board computerField = new Board();
	boolean gameOver = false;
	Random random = new Random();

	public int getShipLength(int n) {
		if (n == 0) {
			return 5;
		} else if (n == 1) {
			return 4;
		} else if (n == 2) {
			return 3;
		} else if (n == 3) {
			return 3;
		} else if (n == 4) {
			return 2;
		}
		return n;
	}

	public char getShipChar(int n) {
		if (n == 0) {
			System.out.println("Placing Carrier.");
			return 'c';
		} else if (n == 1) {
			System.out.println("Placing Battleship.");
			return 'b';
		} else if (n == 2) {
			System.out.println("Placing Destroyer.");
			return 'd';
		} else if (n == 3) {
			System.out.println("Placing Submarine.");
			return 's';
		} else if (n == 4) {
			System.out.println("Placing Patrol Boat.");
			return 'p';
		}
		return 'n';
	}

	public void placePlayerShip() {
		int length;
		char shipLetter;
		for (int n = 0; n < 5; n++) {
			System.out.println("Please enter your ship coordinates separated by a space. Ex: A 1");
			System.out.println("From letter 'A' to 'J' and Number from '1' to '9'");
			String input = scan.nextLine();
			if(input.isEmpty() || input.length() != 3 || !Character.isWhitespace(input.charAt(1))) {
				System.out.println("Can't Place Ship Please Choose Again");
			}
			else {
			input = input.toUpperCase();
			char coords_input = input.charAt(0);
			char col_input = input.charAt(2);
			int rowValue = coords_input - 'A';
			int colValue = Character.getNumericValue(col_input);
			System.out.println("Would you like the ship to be [V]ertical or [H]orizontal?");
			input = scan.nextLine();
			input = input.toUpperCase();
			char orientation = input.charAt(0);
			length = getShipLength(n);
			shipLetter = getShipChar(n);
			boolean shipFit = playerField.canShipFit(length, orientation, rowValue, colValue);
			if (shipFit == false) {
				n--;
			} else {
				playerField.placeShip(length, shipLetter, orientation, rowValue, colValue);
			}
			System.out.println(playerField.lowerToString());
			}
		}
	}

	public void placeComputerShip() {
		int length;
		char shipLetter;
		char orientation;
		for (int n = 0; n < 5; n++) {
			int row_place = random.nextInt(10);
			int col_place = random.nextInt(10);
			int orientation_num = random.nextInt(2);
			if (orientation_num == 0) {
				orientation = 'V';
			} else {
				orientation = 'H';
			}
			length = getShipLength(n);
			shipLetter = getShipChar(n);
			if (computerField.canShipFit(length, orientation, row_place, col_place) == true) {
				computerField.placeShip(length, shipLetter, orientation, row_place, col_place);
			} else {
				while (computerField.canShipFit(length, orientation, row_place, col_place) == false) {
					int row_place_rand = random.nextInt(10);
					row_place = row_place_rand;
					int col_place_rand = random.nextInt(10);
					col_place = col_place_rand;
					int orientation_num_rand = random.nextInt(2);
					if (orientation_num_rand == 0) {
						orientation = 'V';
					} else {
						orientation = 'H';
					}
				}
				computerField.placeShip(length, shipLetter, orientation, row_place, col_place);
			}

		}
	}

	public void setup() {
		Board computer = computerField;
		computer.BOARD();
		placeComputerShip();
		System.out.println("Computer is ready!");
		System.out.println("");
		Board player = playerField;
		player.BOARD();
		placePlayerShip();
		System.out.println("Player is ready!");
	}

	public boolean gameOver() {
		if (coords_input == 'Q') {
			gameOver = true;
			System.out.println("User has left the game. Thanks for playing!");
			System.out.println("Player's Ship Placements:");
			System.out.println(playerField.lowerToString());
			System.out.println("Player's Attack Placements:");
			System.out.println(playerField.upperToString());
			System.out.println("Computer's Ship Placements:");
			System.out.println(computerField.lowerToString());
			System.out.println("Computer's Attack Placements:");
			System.out.println(computerField.upperToString());
			return true;
		} else if (playerField.hasNoShips() == true) {
			gameOver = true;
			System.out.println("Player has no more ships, Computer has won. Thanks for playing!");
			System.out.println("Player's Ship Placements:");
			System.out.println(playerField.lowerToString());
			System.out.println("Computer's Attack Placements:");
			System.out.println(computerField.upperToString());
			return true;
		} else if (computerField.hasNoShips() == true) {
			gameOver = true;
			System.out.println("Computer has no more ships, Player has won. Thanks for playing!");
			System.out.println("Computer's Ship Placements:");
			System.out.println(computerField.lowerToString());
			System.out.println("Player's Attack Placements:");
			System.out.println(playerField.upperToString());
			return true;
		} else {
			return false;
		}
	}

	public void play() {
		if (gameOver == false) {
			playerTurn();
			computerTurn();
		} else if (gameOver == true) {
		}
	}

	public void playerTurn() {
		System.out.println(playerField.upperToString());
		System.out.println("Please enter your coordinates seperated by a space. Ex: A 1");
		System.out.println("Enter 'Q' as your first coordinate if you'd like to quit the game.");
		while (gameOver == false) {
			System.out.println("Enter coords:");
			String input = scan.nextLine();
			input = input.toUpperCase();
			coords_input = input.charAt(0);
			if (coords_input == 'Q') {
				gameOver();
			} else {
				char col_input = input.charAt(2);
				int rowValue = coords_input - 'A';
				int colValue = Character.getNumericValue(col_input);
				if (computerField.shootAt(rowValue, colValue) == true) {
					playerField.recordHit(rowValue, colValue);
					System.out.println(input + " is a hit!");
					System.out.println(playerField.upperToString());
				} else if (computerField.shootAt(rowValue, colValue) == false) {
					playerField.recordMiss(rowValue, colValue);
					System.out.println(input + " is a miss!");
					System.out.println(playerField.upperToString());
				}
				computerTurn();
			}
		}
	}

	public void computerTurn() {
		int upper_row_rand = random.nextInt(10);
		int upper_col_rand = random.nextInt(10);
		if (playerField.shootAt(upper_row_rand, upper_col_rand) == true) {
			computerField.recordHit(upper_row_rand, upper_col_rand);
		} else if (playerField.shootAt(upper_row_rand, upper_col_rand) == false) {
			computerField.recordMiss(upper_row_rand, upper_col_rand);
		}
	}

	// === STATIC STUFF
	// ============================================================================================
	public static void main(String[] args) {
		GameBoardTerminal game = new GameBoardTerminal();
		game.setup();
		game.play();
	}

}
