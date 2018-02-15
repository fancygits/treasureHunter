package edu.westga.cs6312.midterm.testing.player;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.midterm.model.Player;

/**
 * Tests the constructor in the Player classs
 * @author James Luke Johnson
 * @version 2018.02.15
 */
class TestPlayerConstructor {

	/**
	 * Test to confirm that the 0-Parameter constructor creates a
	 * player with 100 money units remaining.
	 */
	@Test
	public void test0ParameterConstructorShouldConstructNewPlayerWith100MoneyUnits() {
		Player newPlayer = new Player();
		assertEquals("Player with 100 money units remaining", newPlayer.toString());
	}

}
