/*****************************************************************
Creates the Patrol Boat 
*****************************************************************/
public class PatrolBoat extends Ship{
     /**
     * Set the Battleship name to "Patrol Boat"
     */
    private final static String name = "Patrol Boat";

    /**
     * Set the Battleship length to 2
     */
    private final static int length = 2;

    /**
     * Set the Battleship identifier character to 'P'
     */
    private final static char identifier = 'P';

    /**
     * Default Constractor to create the ship "Patrol Boat"
     */
    public PatrolBoat(){
        super(name, length, identifier);
    }
}