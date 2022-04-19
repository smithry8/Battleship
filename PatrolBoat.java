/*****************************************************************
Creates the Patrol Boat 
*****************************************************************/
public class PatrolBoat extends Ship{
    private final static String name = "Patrol Boat";
    private final static int length = 2;
    private final static char identifier = 'P';
    
    public PatrolBoat(){
        super(name, length, identifier);
    }
}
