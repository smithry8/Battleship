/*****************************************************************
Creates the Battleship 
*****************************************************************/
public class Battleship extends Ship{
    /**
     * Set the Battleship name to "Battleship"
     */
    private final static String name = "Battleship";

    /**
     * Set the Battleship length to 4
     */
    private final static int length = 4;

    /**
     * Set the Battleship identifier character to 'B'
     */
    private final static char identifier = 'B';

    /**
     * Default Constractor to create the ship "Battleship"
     */
    public Battleship(){
        super(name, length, identifier);
    }
}