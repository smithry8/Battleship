public class GameBoard implements ShipMethod{

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
	* create an object of Carrier
 	*/
	private Carrier carrier;

	/**
	* create an object of Battleship
 	*/
	 private Battleship battleship;

	/**
	* create an object of Destroyer
 	*/
	 private Destroyer destoryer;

	/**
	* create an object of Submarine
 	*/
	private Submarine submarine;

	/**
	* create an object of Patrolboat
 	*/
	 private PatrolBoat patrolBoat;

   /**
	* set carrier size  
	*/
   private int carrier_ship = 5;

   /**
	* set battleship size
	*/
   private int battleship_ship = 4;

   /**
	* set destroyer size
	*/
   private int destroyer_ship = 3;

   /**
	* set submarine size
	*/
   private int submarine_ship = 3;

   /**
	* set patrolboat size
	*/
   private int patrol_ship = 2;

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
	Create a Carrier Object
	@return Carrier Object
	*****************************************************************/
   public Carrier createCarrier(){
	   //carrier name, size, and identifier
	   Carrier carrier = new Carrier();
	   return carrier;
   }
	 
   /*****************************************************************
	Create a Battleship Object
	@return Battleship Object
	*****************************************************************/
   public Battleship createBattleship(){
	   //battleship name, size, and identifier
	   Battleship battleship = new Battleship();
	   return battleship;
   }
	 
   /*****************************************************************
	Create a Destroyer Object
	@return Destroyer Object
	*****************************************************************/
   public Destroyer createDestroyer(){
	   //destroyer name, size, and identifier
	   Destroyer destroyer = new Destroyer();
	   return destroyer;
   }
	   
   /*****************************************************************
	Create a Submarine Object
	@return Submarine Object
	*****************************************************************/
	 public Submarine createSubmarine(){  
	   //submarine name, size, and identifier
	   Submarine submarine = new Submarine();
	   return submarine;
	 }

	/*****************************************************************
	Create a PatrolBoat Object
	@return PatrolBoat Object
	*****************************************************************/
   public PatrolBoat createPatrolBoat(){
	   //patrol boat name, size, and identifier
	   PatrolBoat patrolBoat = new PatrolBoat();
	   return patrolBoat;

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
	//checks if the enemy carrier is sunk   
	if (lower_map[row][col] == 'c') {
		   carrier_ship--;
		   if (carrier_ship == 0) {
			   System.out.println("Enemy Carrier has been sunk!");
			   return true;
		   }
		   return true;
		//checks if the enemy battleship is sunk
	   } else if (lower_map[row][col] == 'b') {
		   battleship_ship--;
		   if (battleship_ship == 0) {
			   System.out.println("Enemy Battleship has been sunk!");
			   return true;
		   }
		   return true;
		//checks if the enemy destroyer is sunk
	   } else if (lower_map[row][col] == 'd') {
		   destroyer_ship--;
		   if (destroyer_ship == 0) {
			   System.out.println("Enemy Destroyer has been sunk!");
			   return true;
		   }
		   return true;
		   //checks if the enemy submarine is sunk
	   } else if (lower_map[row][col] == 's') {
		   submarine_ship--;
		   if (submarine_ship == 0) {
			   System.out.println("Enemy Submarine has been sunk!");
			   return true;
		   }
		   return true;
		   //checks if the enemy patrol boat is sunk
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

   /*****************************************************************
	Marks a hit on the board
	*****************************************************************/
   public void recordHit(int row, int col) {
	   //sets the space to x to mark the hit
	   this.upper_map[row][col] = 'x';
   }

   /*****************************************************************
	Marks a miss on the board
	*****************************************************************/
   public void recordMiss(int row, int col) {
	   //sets the space to o to mark a miss
	   this.upper_map[row][col] = 'o';
   }

   /*****************************************************************
	Determines if the player or the computer has any ships left
	@return the boolean if there are ships left or not
	*****************************************************************/
   public boolean hasNoShips() {
	   //checks if the player or computer is out of ships
	   if (carrier_ship == 0 && battleship_ship == 0 && destroyer_ship == 0 && submarine_ship == 0
			   && patrol_ship == 0) {
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
	   //checks if the ship goes horizontal
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
		   //checks if the ship goes vertical
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
		   //if input wasn't V or H
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
		//checks if the ship is vertical   
		if (orientation == 'V') {
			   for (int i = row; i < (length + row); i++) {
				   lower_map[i][col] = shipLetter;
			   }
			   //checks if the ship is horizontal
		   } else if (orientation == 'H') {
			   for (int i = col; i < (length + col); i++) {
				   lower_map[row][i] = shipLetter;
			   }
		   }
	   } else {
		   //if the ship does not fit
		   System.out.println("Error placing ship.");
	   }
   }
}

