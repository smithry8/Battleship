
public abstract class Ship {
	/**
	 * value for the name of the ship
	 */
	private String name;

	/**
	 * value for length
	 */
	private int length;

	/**
	 * value for the identifier on the board
	 */
	private char identifier;

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
	public Ship(String name, int length, char identifier){
		this.name = name;
		this.length = length;
		this.identifier = identifier;
	}

	/*****************************************************************
	 Constructor that sets the ship to their given values
	 *****************************************************************/
	public Ship(String name, int length, char identifier, int xCoord, int yCoord){
		this.name = name;
		this.length = length;
		this.identifier = identifier;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
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
}
