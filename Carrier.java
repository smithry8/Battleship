/*****************************************************************
Creates the Carrier ship 
*****************************************************************/
public class Carrier extends Ship{
    /**
     * Set the Battleship name to "Carrier"
     */
    private final static String name = "Carrier";

    /**
     * Set the Battleship length to 5
     */
    private final static int length = 5;

    /**
     * Set the Battleship identifier character to 'C'
     */
    private final static char identifier = 'C';

    /**
     * Default Constractor to create the ship "Carrier"
     */
    public Carrier(){
        super(name, length, identifier);
    }
}