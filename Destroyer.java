/*****************************************************************
Creates the Destroyer 
*****************************************************************/
public class Destroyer extends Ship{
     /**
     * Set the Battleship name to "Destoryer"
     */
    private final static String name = "Destoryer";

    /**
     * Set the Battleship length to 3
     */
    private final static int length = 3;

    /**
     * Set the Battleship identifier character to 'D'
     */
    private final static char identifier = 'D';


    /**
     * Default Constractor to create the ship "Destroyer"
     */
    public Destroyer(){
        super(name, length, identifier);
    }
}