
public abstract class Ship {
	private int length;
	private char identifier;
	private boolean vertical;
	private String name;
	private int xCoord;
	private int yCoord;

	
	public Ship() {
		this.setLength(0);
		this.setIdentifier('n');
		this.setVertical(true);
	}

	
	public Ship(int length, char indentifier, boolean vertical) {
		this.setLength(length);
		this.setIdentifier(indentifier);
		this.setVertical(vertical);
	}

	
	public String getName() {
		return this.name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public int getxCoord() {
		return xCoord;
	}

	
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	
	public int getyCoord() {
		return yCoord;
	}

	
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	
	public boolean isVertical() {
		return vertical;
	}

	
	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}

	
	public char getIdentifier() {
		return identifier;
	}

	
	public void setIdentifier(char identifier) {
		this.identifier = identifier;
	}

	
	public int getLength() {
		return length;
	}

	
	private void setLength(int length) {
		this.length = length;
	}
}
