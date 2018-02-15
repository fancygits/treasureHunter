package edu.westga.cs6312.midterm.testing.player;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.midterm.model.Player;

/**
 * Tests the acceptMoney method of Player
 * @author James Luke Johnson
 * @version 2018.02.15
 */
class TestPlayerAcceptMoney {

	/**
	 * Test to confirm that a new Player that accepts 900
	 * money units has 1000 money units
	 */
	@Test
	public void testAcceptMoney900ForNewPlayerShouldHave1000() {
		Player richPlayer = new Player();
		richPlayer.acceptMoney(900);
		assertEquals(1000, richPlayer.getMoneyRemaining());
	}

	/**
	 * Test to confirm that a new Player that accepts 1 money
	 * units has 101 money units
	 */
	@Test
	public void testAcceptMoney1ForNewPlayerShouldHave101() {
		Player poorPlayer = new Player();
		poorPlayer.acceptMoney(1);
		assertEquals(101, poorPlayer.getMoneyRemaining());
	}
	
	/**
	 * Test to confirm that the acceptMoney method with a negative
	 * number accepts 0 money units instead.
	 */
	@Test
	public void testAcceptMoneyNegative100ForNewPlayerShouldHave100() {
		Player luckyPlayer = new Player();
		luckyPlayer.acceptMoney(-100);
		assertEquals(100, luckyPlayer.getMoneyRemaining());
	}
}
