/*****************************************************************
Creates the Submarine 
*****************************************************************/
public class Submarine extends Ship{
    /**
     * Set the Battleship name to "Submarine"
     */
    private final static String name = "Submarine";

    /**
     * Set the Battleship length to 3
     */
    private final static int length = 3;

    /**
     * Set the Battleship identifier character to 'S'
     */
    private final static char identifier = 'S';

    /**
     * Default Constractor to create the ship "Submarine"
     */
    public Submarine(){
        super(name, length, identifier);
    }
}