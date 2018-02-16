package edu.westga.cs6312.midterm.testing.gameboard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.midterm.model.GameBoard;

/**
 * Tests the GameBoard class accessor methods
 * @author James Luke Johnson
 * @version 2018.02.16
 */
class TestGameBoardGetMethods {

	/**
	 * Test to confirm that getPlayer on a new GameBoard returns
	 * a player with 100 money units
	 */
	@Test
	public void testGetPlayerShouldReturnPlayerWith100MoneyUnits() {
		GameBoard game1 = new GameBoard();
		assertEquals("Player with 100 money units remaining", game1.getPlayer().toString());
	}
	
	/**
	 * Test to confirm that getCurrentRoom on a new GameBoard returns
	 * a Room with an ID of 0
	 */
	@Test
	public void testGetCurrentRoomForNewGameBoardShouldReturn0() {
		GameBoard game2 = new GameBoard();
		assertEquals("Room at [0]", game2.getCurrentRoom().getLocation());
	}

}
