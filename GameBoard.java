public class GameBoard implements ShipMethod{
    private int[][] grid;
    private final int height = 10;
    private final int width = 10;
    public Object battleshipObject;

    @Override
    public void createBoard() {
        this.grid = new int[this.height][this.width];
        for(int[] x : grid){
            for(int y : x){
                System.out.print("^" + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void getGameStatus() {
        // TODO Auto-generated method stub
        //Return when user won the game

        //Return when user is still playing

        //Return when user lose
        
    }

    @Override
    public void placeShips() {
        // TODO Auto-generated method stub
        for(int i = 0; i < 5; i++){
            
        }
    }

    @Override
    public void recordHit(char identifier, int row, int column) {
        // TODO Auto-generated method stub
        //record a hit on AI ship or player ship
    }

    @Override
    public void recordMiss(char identifier, int row, int column) {
        // TODO Auto-generated method stub
        //record a miss on AI ship or player ship
    }

    @Override
    public void resetGame() {
        // TODO Auto-generated method stub
        //Reset game after a win or a lose
        for (int rows = 0; rows < height; rows++) {
            for (int columns = 0; columns < width; columns++) {
                grid[rows][columns] = 0;
            }
        }
    }

    @Override
    public void shootAt(int row, int column) {
        // TODO Auto-generated method stub
        //Choose a coord to shoot at
    }

    @Override
    public void createBattleship() {
        Battleship battleship = new Battleship();
        System.out.println(battleship.getName());
        System.out.println(battleship.getLength());
        System.out.println(battleship.getIdentifier());
    }

    @Override
    public void createCarrier() {
        Carrier carrier = new Carrier();
        System.out.println(carrier.getName());
        System.out.println(carrier.getLength());
        System.out.println(carrier.getIdentifier());
    }

    @Override
    public void createDestoryer() {
        Destroyer destroyer = new Destroyer();
        System.out.println(destroyer.getName());
        System.out.println(destroyer.getLength());
        System.out.println(destroyer.getIdentifier());
    }

    @Override
    public void createPatrolBoat() {
        PatrolBoat patrolBoat = new PatrolBoat();
        System.out.println(patrolBoat.getName());
        System.out.println(patrolBoat.getLength());
        System.out.println(patrolBoat.getIdentifier());
    }

    @Override
    public void createSubmarine() {
        Submarine submarine = new Submarine();
        System.out.println(submarine.getName());
        System.out.println(submarine.getLength());
        System.out.println(submarine.getIdentifier());
    }

    public static void main(String[] args) {
        GameBoard game = new GameBoard();
        game.createBoard();
        game.resetGame();
        game.createDestoryer();
    }
    
}
