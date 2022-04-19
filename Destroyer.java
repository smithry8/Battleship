/*****************************************************************
Creates the Destroyer 
*****************************************************************/
public class Destroyer extends Ship{
    private final static String name = "Destoryer";
    private final static int length = 3;
    private final static char identifier = 'D';

    public Destroyer(){
        super(name, length, identifier);
    }
}
