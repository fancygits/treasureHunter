package edu.westga.cs6312.midterm.testing.player;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.midterm.model.Player;

/**
 * Tests the getMoneyRemaining method of the Player class
 * @author James Luke Johnson
 * @version 2018.02.15
 */
class TestPlayerGetMoneyRemaining {

	/**
	 * Test to confirm that getMoneyRemaining on a new Player
	 * returns 100 money units, the default starting amount
	 */
	@Test
	public void testGetMoneyRemainingForNewPlayerShouldReturn100() {
		Player newPlayer = new Player();
		assertEquals(100, newPlayer.getMoneyRemaining());
	}
	
	/**
	 * Test to confirm that a new Player with 500 money units
	 * returns 500. Money added with the acceptMoney method (100 + 400)
	 */
	@Test
	public void testGetMoneyRemainingForPlayerwith500ShouldReturn500() {
		Player richPlayer = new Player();
		richPlayer.acceptMoney(400);
		assertEquals(500, richPlayer.getMoneyRemaining());
	}
	
	/**
	 * Test to confirm that a new Player with 0 money units
	 * returns 0. Money subtracted with the deductMoney method (100 - 100)
	 */
	@Test
	public void testGetMoneyRemainingForPlayerwith0ShouldReturn0() {
		Player poorPlayer = new Player();
		poorPlayer.deductMoney(100);
		assertEquals(0, poorPlayer.getMoneyRemaining());
	}
}
