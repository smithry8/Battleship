public class Board {

	private int boardSize = 10;
	char[][] upper_map = new char[boardSize][boardSize];
	char[][] lower_map = new char[boardSize][boardSize];
	int carrier_ship = 5;
	int battleship_ship = 4;
	int destroyer_ship = 3;
	int submarine_ship = 3;
	int patrol_ship = 2;

	public void BOARD() {
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				upper_map[i][j] = '^';
				lower_map[i][j] = '^';
			}
		}
	}

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

	public boolean shootAt(int row, int col) {
		if (lower_map[row][col] == 'c') {
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
			patrol_ship--;
			if (patrol_ship == 0) {
				System.out.println("Enemy Patrol Boat has been sunk!");
				return true;
			}
			return true;
		} else {
			return false;
		}
	}

	public void recordHit(int row, int col) {
		this.upper_map[row][col] = 'x';
	}

	public void recordMiss(int row, int col) {
		this.upper_map[row][col] = 'o';
	}

	public boolean hasNoShips() {
		if (carrier_ship == 0 && battleship_ship == 0 && destroyer_ship == 0 && submarine_ship == 0
				&& patrol_ship == 0) {
			return true;
		} else {
			return false;
		}
	}

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
