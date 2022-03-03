
public abstract class Ship {
	/**
	 * value for length
	 */
	private int length;
	
	/**
	 * value for the identifier on the board
	 */
	private char identifier;
	
	/**
	 * value for if the ship is vertical
	 */
	private boolean vertical;
	
	/**
	 * value for the name of the ship
	 */
	private String name;
	
	/**
	 * value of the x coordinate
	 */
	private int xCoord;
	
	/**
	 * value for the y coordinate
	 */
	private int yCoord;

	/*****************************************************************
	 Default constructor
	 *****************************************************************/
	public Ship() {
		this.setLength(0);
		this.setIdentifier('n');
		this.setVertical(true);
	}

	/*****************************************************************
	 Constructor that sets the ship to their given values
	 *****************************************************************/
	public Ship(int length, char indentifier, boolean vertical) {
		this.setLength(length);
		this.setIdentifier(indentifier);
		this.setVertical(vertical);
	}

	/*****************************************************************
	 Gets the name of the ship
	 @return the name
	 *****************************************************************/
	public String getName() {
		return this.name;
	}

	/*****************************************************************
	 Sets the name of the ship
	 *****************************************************************/
	public void setName(String name) {
		this.name = name;
	}

	/*****************************************************************
	 Gets the x coordinate of the ship
	 @return the x coordinate
	 *****************************************************************/
	public int getxCoord() {
		return xCoord;
	}

	/*****************************************************************
	 Sets the x coordinate of the ship
	 *****************************************************************/
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	/*****************************************************************
	 Gets the y coordinate of the ship
	 @return y coordinate
	 *****************************************************************/
	public int getyCoord() {
		return yCoord;
	}

	/*****************************************************************
	 Sets the y coordinate of the ship
	 *****************************************************************/
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	/*****************************************************************
	 Checks if the ship is vertical or not
	 @return boolean if vertical or not
	 *****************************************************************/
	public boolean isVertical() {
		return vertical;
	}

	/*****************************************************************
	 Sets the ship to vertical if the input is true 
	 *****************************************************************/
	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}

	/*****************************************************************
	 Gets the identifier for the ship
	 @return the identifier of the ship
	 *****************************************************************/
	public char getIdentifier() {
		return identifier;
	}

	/*****************************************************************
	 Sets the identifier for the ship
	 *****************************************************************/
	public void setIdentifier(char identifier) {
		this.identifier = identifier;
	}

	/*****************************************************************
	 Gets the length of the ship
	 @return the length of the ship
	 *****************************************************************/
	public int getLength() {
		return length;
	}

	/*****************************************************************
	 Sets the length of the ship
	 *****************************************************************/
	private void setLength(int length) {
		this.length = length;
	}
}
