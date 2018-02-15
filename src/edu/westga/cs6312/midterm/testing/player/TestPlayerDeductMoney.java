package edu.westga.cs6312.midterm.testing.player;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.midterm.model.Player;

/**
 * Tests the deductMoney method of Player
 * @author James Luke Johnson
 * @version 2018.02.15
 */
class TestPlayerDeductMoney {

	/**
	 * Test to confirm that a new Player that deducts 100
	 * money units has 0 money units
	 */
	@Test
	public void testDeductMoney100ForNewPlayerShouldHave0() {
		Player poorPlayer = new Player();
		poorPlayer.deductMoney(100);
		assertEquals(0, poorPlayer.getMoneyRemaining());
	}

	/**
	 * Test to confirm that a new Player that deducts 1 money
	 * units has 99 money units
	 */
	@Test
	public void testDeductMoney1ForNewPlayerShouldHave99() {
		Player richPlayer = new Player();
		richPlayer.deductMoney(1);
		assertEquals(99, richPlayer.getMoneyRemaining());
	}
	
	/**
	 * Test to confirm that the deductMoney method with a negative
	 * number deducts 0 money units instead.
	 */
	@Test
	public void testDeductMoneyNegative100ForNewPlayerShouldHave100() {
		Player unluckyPlayer = new Player();
		unluckyPlayer.deductMoney(-100);
		assertEquals(100, unluckyPlayer.getMoneyRemaining());
	}

}
