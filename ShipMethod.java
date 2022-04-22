public interface ShipMethod {
    public void BOARD();

    public Carrier createCarrier();

    public Battleship createBattleship();

    public Destroyer createDestroyer();

    public Submarine createSubmarine();

    public PatrolBoat createPatrolBoat();

    public String upperToString();

    public String lowerToString();

    public boolean shootAt(int row, int col);

    public void recordHit(int row, int col);

    public void recordMiss(int row, int col);

    public boolean hasNoShips();

    public boolean canShipFit(int length, char orientation, int row, int col);

    public void placeShip(int length, char shipLetter, char orientation, int row, int col);

    
}
