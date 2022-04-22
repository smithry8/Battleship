import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import org.junit.Test;

public class BattleshipTest
 {
	
	@Test
	public void testBattleShipsTrue() {
		Ship s = new Battleship();
		s.setName("Battleship");
		s.setLength(4);
		s.setIdentifier('B');
		assertTrue(s.getName() == "Battleship");
		assertTrue(s.getLength() == 4);
		assertTrue(s.getIdentifier() == 'B');
	}
	
	@Test
	public void testBattleShipsFalse() {
		Ship s = new Battleship();
		s.setName("Battleship");
		s.setLength(4);
		s.setIdentifier('B');
		assertFalse(s.getName() == "Battl");
		assertFalse(s.getLength() == 2);
		assertFalse(s.getIdentifier() == 'f');
	}
	
	@Test
	public void testCarrier() {
		Ship s = new Carrier();
		s.setName("Carrier");
		s.setLength(5);
		s.setIdentifier('C');
		assertTrue(s.getName() == "Carrier");
		assertTrue(s.getLength() == 5);
		assertTrue(s.getIdentifier() == 'C');
	}
	
	@Test
	public void testCarrierFalse() {
		Ship s = new Carrier();
		s.setName("Carrier");
		s.setLength(5);
		s.setIdentifier('C');
		assertFalse(s.getName() == "C");
		assertFalse(s.getLength() == 2);
		assertFalse(s.getIdentifier() == 'f');
	}
	
	@Test
	public void testDestroyer() {
		Ship s = new Destroyer();
		s.setName("Destroyer");
		s.setLength(3);
		s.setIdentifier('D');
		assertTrue(s.getName() == "Destroyer");
		assertTrue(s.getLength() == 3);
		assertTrue(s.getIdentifier() == 'D');
	}
	
	@Test
	public void testDestroyerFalse() {
		Ship s = new Destroyer();
		s.setName("Destroyer");
		s.setLength(3);
		s.setIdentifier('D');
		assertFalse(s.getName() == "D");
		assertFalse(s.getLength() == 2);
		assertFalse(s.getIdentifier() == 's');
	}
	
	@Test
	public void testPatrolBoat() {
		Ship s = new PatrolBoat();
		s.setName("Patrol Boat");
		s.setLength(2);
		s.setIdentifier('P');
		assertTrue(s.getName() == "Patrol Boat");
		assertTrue(s.getLength() == 2);
		assertTrue(s.getIdentifier() == 'P');
	}
	
	@Test
	public void testPatrolBoatFalse() {
		Ship s = new PatrolBoat();
		s.setName("Patrol Boat");
		s.setLength(2);
		s.setIdentifier('P');
		assertFalse(s.getName() == "P");
		assertFalse(s.getLength() == 5);
		assertFalse(s.getIdentifier() == 'g');
	}
	
	@Test
	public void testSubmarine() {
		Ship s = new Submarine();
		s.setName("Submarine");
		s.setLength(3);
		s.setIdentifier('S');
		assertTrue(s.getName() == "Submarine");
		assertTrue(s.getLength() == 3);
		assertTrue(s.getIdentifier() == 'S');
	}
	
	@Test
	public void testSubmarineFalse() {
		Ship s = new Submarine();
		s.setName("Submarine");
		s.setLength(4);
		s.setIdentifier('S');
		assertFalse(s.getName() == "s");
		assertFalse(s.getLength() == 2);
		assertFalse(s.getIdentifier() == 'f');
	}
	
	@Test
	public void testBattleshipPlace() {
		Ship s= new Battleship();
		s.setName("Battleship");
		s.setLength(4);
		s.setIdentifier('B');
		s.setxCoord(1);
		s.setyCoord(1);
		assertTrue(s.getName() == "Battleship");
		assertTrue(s.getLength() == 4);
		assertTrue(s.getIdentifier() == 'B');
		assertTrue(s.getxCoord() == 1);
		assertTrue(s.getyCoord() == 1);
	}
	
	@Test
	public void testCarrierPlace() {
		Ship s= new Carrier();
		s.setName("Carrier");
		s.setLength(5);
		s.setIdentifier('C');
		s.setxCoord(1);
		s.setyCoord(1);
		assertTrue(s.getName() == "Carrier");
		assertTrue(s.getLength() == 5);
		assertTrue(s.getIdentifier() == 'C');
		assertTrue(s.getxCoord() == 1);
		assertTrue(s.getyCoord() == 1);
	}
	
	@Test
	public void testDestroyerPlace() {
		Ship s= new Destroyer();
		s.setName("Destroyer");
		s.setLength(3);
		s.setIdentifier('D');
		s.setxCoord(1);
		s.setyCoord(1);
		assertTrue(s.getName() == "Destroyer");
		assertTrue(s.getLength() == 3);
		assertTrue(s.getIdentifier() == 'D');
		assertTrue(s.getxCoord() == 1);
		assertTrue(s.getyCoord() == 1);
	}
	
	@Test
	public void testPatrolBoatPlace() {
		Ship s= new PatrolBoat();
		s.setName("Patrol Boat");
		s.setLength(2);
		s.setIdentifier('P');
		s.setxCoord(1);
		s.setyCoord(1);
		assertTrue(s.getName() == "Patrol Boat");
		assertTrue(s.getLength() == 2);
		assertTrue(s.getIdentifier() == 'P');
		assertTrue(s.getxCoord() == 1);
		assertTrue(s.getyCoord() == 1);
	}
	
	@Test
	public void testSubmarinePlace() {
		Ship s= new Submarine();
		s.setName("Submarine");
		s.setLength(3);
		s.setIdentifier('S');
		s.setxCoord(1);
		s.setyCoord(1);
		assertTrue(s.getName() == "Submarine");
		assertTrue(s.getLength() == 3);
		assertTrue(s.getIdentifier() == 'S');
		assertTrue(s.getxCoord() == 1);
		assertTrue(s.getyCoord() == 1);
	}
	
	@Test
	public void testTerminalShipLengthCarrier() {
		GameTerminal g = new GameTerminal();
		Ship s = new Carrier();
		
		assertEquals(s.getLength(), g.getShipLength(0));
	}
	
	@Test
	public void testTerminalShipLengthBattleship() {
		GameTerminal g = new GameTerminal();
		Ship s = new Battleship();
		
		assertEquals(s.getLength(), g.getShipLength(1));
	}
	
	@Test
	public void testTerminalShipLengthDestroyer() {
		GameTerminal g = new GameTerminal();
		Ship s = new Destroyer();
		
		assertEquals(s.getLength(), g.getShipLength(2));
	}
	
	@Test
	public void testTerminalShipLengthSubmarine() {
		GameTerminal g = new GameTerminal();
		Ship s = new Submarine();
		
		assertEquals(s.getLength(), g.getShipLength(3));
	}
	
	@Test
	public void testTerminalShipLengthPatrolBoat() {
		GameTerminal g = new GameTerminal();
		Ship s = new PatrolBoat();
		
		assertEquals(s.getLength(), g.getShipLength(4));
	}
	
	@Test
	public void testTerminalShipBitCarrier() {
		GameTerminal g = new GameTerminal();
		Ship s = new Carrier();
		
		assertEquals(s.getIdentifier(), g.getShipChar(0));
	}
	
	@Test
	public void testTerminalShipBitBattleship() {
		GameTerminal g = new GameTerminal();
		Ship s = new Battleship();
		
		assertEquals(s.getIdentifier(), g.getShipChar(1));
	}
	
	@Test
	public void testTerminalShipBitDestroyer() {
		GameTerminal g = new GameTerminal();
		Ship s = new Destroyer();
		
		assertEquals(s.getIdentifier(), g.getShipChar(2));
	}
	
	@Test
	public void testTerminalShipBitSubmarine() {
		GameTerminal g = new GameTerminal();
		Ship s = new Submarine();
		
		assertEquals(s.getIdentifier(), g.getShipChar(3));
	}
	
	@Test
	public void testTerminalShipBitPatrolBoat() {
		GameTerminal g = new GameTerminal();
		Ship s = new PatrolBoat();
		
		assertEquals(s.getIdentifier(), g.getShipChar(4));
	}
		
	@Test
	public void testTerminalShipBitCarrierFalse() {
		GameTerminal g = new GameTerminal();
		Ship s = new Carrier();
		
		assertFalse(s.getIdentifier() == g.getShipChar(1));
	}
	
	@Test
	public void testTerminalShipBitBattleShipFalse() {
		GameTerminal g = new GameTerminal();
		Ship s = new Battleship();
		
		assertFalse(s.getIdentifier() == g.getShipChar(3));
	}
	
	@Test
	public void testTerminalShipBitDestroyerFalse() {
		GameTerminal g = new GameTerminal();
		Ship s = new Destroyer();
		
		assertFalse(s.getIdentifier() == g.getShipChar(1));
	}
	
	@Test
	public void testTerminalShipBitSubmarineFalse() {
		GameTerminal g = new GameTerminal();
		Ship s = new Submarine();
		
		assertFalse(s.getIdentifier() == g.getShipChar(1));
	}
	
	@Test
	public void testTerminalShipBitPatrolBoatFalse() {
		GameTerminal g = new GameTerminal();
		Ship s = new PatrolBoat();
		
		assertFalse(s.getIdentifier() == g.getShipChar(1));
	}
	
//	@Test
//	public void testPlacementWorks() {
//		GameTerminal g = new GameTerminal();
//		Scanner scan = new Scanner(System.in);
//		
//		String i1P = "A 1";
//		String i1H = "H";
//		String i2P = "B 1";
//		String i2H = "H";
//		String i3P = "C 1";
//		String i3H = "H";
//		String i4P = "D 1";
//		String i4H = "H";
//		String i5P = "E 1";
//		String i5H = "H";
//		InputStream stdin = System.in;
//		try {
//			System.setIn(new ByteArrayInputStream(i1P.getBytes()));
//			String inp = scan.nextLine();
//			
//		}
//		finally {
//			
//		}
//	}
	
	@Test
	public void testGameOver() {
		GameTerminal g = new GameTerminal();
		
		boolean inp = g.gameOver();
		
		assertTrue(g.gameOver() == true);
	}
	
	@Test
	public void testPlayerTurn() {
		GameTerminal g = new GameTerminal();
		
		g.playerTurn();
		
		
	}
}