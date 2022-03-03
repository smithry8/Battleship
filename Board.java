
public class Board {

	/**
	 * sets the boardSize to 10
	 */
	private int boardSize = 10;
	
	/**
	 * creates a 2D array called upper_map
	 */
	char[][] upper_map = new char[boardSize][boardSize];
	
	/**
	 * creates a 2D array called lower_map
	 */
	char[][] lower_map = new char[boardSize][boardSize];
	
	/**
	 * sets carrier_ship to 5
	 */
	int carrier_ship = 5;
	
	/**
	 * sets battleship_ship to 4
	 */
	int battleship_ship = 4;
	
	/**
	 * sets destroyer_ship to 3
	 */
	int destroyer_ship = 3;
	
	/**
	 * sets submarine_ship to 3
	 */
	int submarine_ship = 3;
	
	/**
	 * does not allow suspend
	 */
	int cruiser_ship = 2;
	
	/*****************************************************************
	 Default constructor that creates the game board.
	 *****************************************************************/
	public void BOARD() {
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				upper_map[i][j] = '^';
				lower_map[i][j] = '^';
			}
		}
	}

	/*****************************************************************
	 This is the toString for the upper board.
	 @return s the char that goes on the board
	 *****************************************************************/
	public String upperToString() {
		String s = "";
		s = s + " ";
		for (int upper_col = 0; upper_col < 10; upper_col++) {
			s = s + (" " + upper_col);
		}
		s = s + "\n";
		for (int upper_row = 0; upper_row < 10; upper_row++) {
			s = s + ((char) (upper_row + 65) + " ");
			for (int upper_col = 0; upper_col < 10; upper_col++) {
				s = s + (upper_map[upper_row][upper_col] + " ");
			}
			s = s + "\n";
		}
		return s;
	}

	/*****************************************************************
	 This is the toString for the lower board.
	 @return s the char that goes on the board
	 *****************************************************************/
	public String lowerToString() {
		String s = "";
		s = s + " ";
		for (int upper_col = 0; upper_col < 10; upper_col++) {
			s = s + (" " + upper_col);
		}
		s = s + "\n";
		for (int lower_row = 0; lower_row < 10; lower_row++) {
			s = s + ((char) (lower_row + 65) + " ");
			for (int lower_col = 0; lower_col < 10; lower_col++) {
				s = s + (lower_map[lower_row][lower_col] + " ");
			}
			s = s + "\n";
		}
		return s;
	}

	/*****************************************************************
	 Determines if the ship has been sunk or not by checking if the 
	 ship is equal to zero.
	 @return the boolean for if the ship has been sunk or not
	 *****************************************************************/
	public boolean shootAt(int row, int col) {
		if (lower_map[row][col] == 'C') {
			carrier_ship--;
			if (carrier_ship == 0) {
				System.out.println("Enemy Carrier has been sunk!");
				return true;
			}
			return true;
		} else if (lower_map[row][col] == 'b') {
			battleship_ship--;
			if (battleship_ship == 0) {
				System.out.println("Enemy Battleship has been sunk!");
				return true;
			}
			return true;
		} else if (lower_map[row][col] == 'd') {
			destroyer_ship--;
			if (destroyer_ship == 0) {
				System.out.println("Enemy Destroyer has been sunk!");
				return true;
			}
			return true;
		} else if (lower_map[row][col] == 's') {
			submarine_ship--;
			if (submarine_ship == 0) {
				System.out.println("Enemy Submarine has been sunk!");
				return true;
			}
			return true;
		} else if (lower_map[row][col] == 'p') {
			cruiser_ship--;
			if (cruiser_ship == 0) {
				System.out.println("Enemy Cruiser has been sunk!");
				return true;
			}
			return true;
		} else {
			return false;
		}
	}

	/*****************************************************************
	 Marks a hit on the board
	 *****************************************************************/
	public void recordHit(int row, int col) {
		this.upper_map[row][col] = 'x';
	}

	/*****************************************************************
	 Marks a miss on the board
	 *****************************************************************/
	public void recordMiss(int row, int col) {
		this.upper_map[row][col] = 'o';
	}
	
	/*****************************************************************
	 Determines if the player or the computer has any ships left
	 @return the boolean if there are ships left or not
	 *****************************************************************/
	public boolean hasNoShips() {
		if (carrier_ship == 0 && battleship_ship == 0 && destroyer_ship == 0 && submarine_ship == 0
				&& cruiser_ship == 0) {
			return true;
		} else {
			return false;
		}
	}

	/*****************************************************************
	 Determines if the ship can fit on the board in the location that
	 was selected
	 @return result if the ship can fit or not
	 *****************************************************************/
	public boolean canShipFit(int length, char orientation, int row, int col) {
		boolean result = true;
		if (orientation == 'H') {
			if ((col + length) > 10) {
				result = false;
			} else {
				for (int i = col; i < (length + col); i++) {
					if (lower_map[row][i] != '^') {
						result = false;
					}
				}
			}
		} else if (orientation == 'V') {
			if ((row + length) > 10) {
				result = false;
			} else {
				for (int i = row; i < (length + row); i++) {
					if (lower_map[i][col] != '^') {
						result = false;
					}
				}
			}
		} else {
			System.out.println("Invalid Orientation");
			result = false;
		}
		return result;
	}

	/*****************************************************************
	 Places the ship on the board
	 *****************************************************************/
	public void placeShip(int length, char shipLetter, char orientation, int row, int col) {
		if (canShipFit(length, orientation, row, col) == true) {
			if (orientation == 'V') {
				for (int i = row; i < (length + row); i++) {
					lower_map[i][col] = shipLetter;
				}
			} else if (orientation == 'H') {
				for (int i = col; i < (length + col); i++) {
					lower_map[row][i] = shipLetter;
				}
			}
		} else {
			System.out.println("Error placing ship.");
		}
	}
}
