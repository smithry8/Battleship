public interface ShipMethod {
    public void createBoard();

    public void resetGame();

    public void createCarrier();

    public void createBattleship();

    public void createDestoryer();

    public void createSubmarine();

    public void createPatrolBoat();

    public void placeShips();

    public void shootAt(int row, int column);

    public void recordHit(char identifier, int row, int column);

    public void recordMiss(char identifier, int row, int column);

    public void getGameStatus();
}
