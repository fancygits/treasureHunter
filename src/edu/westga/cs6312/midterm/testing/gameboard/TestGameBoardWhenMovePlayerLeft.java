package edu.westga.cs6312.midterm.testing.gameboard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.midterm.model.GameBoard;

/**
 * Tests the GameBoard moveLeft method
 * @author James Luke Johnson
 * @version 2018.02.18
 */
class TestGameBoardWhenMovePlayerLeft {

	/**
	 * Test to confirm that on a new GameBoard, moveLeft returns a room
	 * at location 9
	 */
	@Test
	void testMoveLeftOnNewGameBoardGetLocationShouldReturnRoomAt9() {
		GameBoard game1 = new GameBoard();
		game1.moveLeft();
		assertEquals("Room at [9]", game1.getCurrentRoom().getLocation());
	}

	/**
	 * Test to confirm that on a new GameBoard, moveLeft 5 times returns 
	 * a room at location 5
	 */
	@Test
	void testMoveLeft5TimesOnGameBoardGetLocationShouldReturnRoomAt5() {
		GameBoard game2 = new GameBoard();
		for (int count = 0; count < 5; count++) {
			game2.moveLeft();
		}
		assertEquals("Room at [5]", game2.getCurrentRoom().getLocation());
	}
	
	/**
	 * Test to confirm that on a new GameBoard, moveLeft 9 times returns 
	 * a room at location 9
	 */
	@Test
	void testMoveLeft9TimesOnGameBoardGetLocationShouldReturnRoomAt1() {
		GameBoard game3 = new GameBoard();
		for (int count = 0; count < 9; count++) {
			game3.moveLeft();
		}
		assertEquals("Room at [1]", game3.getCurrentRoom().getLocation());
	}
	
	/**
	 * Test to confirm that on a new GameBoard, moveLeft 10 times returns 
	 * a room at location 0
	 */
	@Test
	void testMoveLeft10TimesOnGameBoardGetLocationShouldReturnRoomAt10() {
		GameBoard game4 = new GameBoard();
		for (int count = 0; count < 10; count++) {
			game4.moveLeft();
		}
		assertEquals("Room at [0]", game4.getCurrentRoom().getLocation());
	}
	
	/**
	 * Test to confirm that on a new GameBoard, moveLeft 15 times returns 
	 * a room at location 5
	 */
	@Test
	void testMoveLeft15TimesOnGameBoardGetLocationShouldReturnRoomAt5() {
		GameBoard game5 = new GameBoard();
		for (int count = 0; count < 15; count++) {
			game5.moveLeft();
		}
		assertEquals("Room at [5]", game5.getCurrentRoom().getLocation());
	}
}
