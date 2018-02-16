package edu.westga.cs6312.midterm.testing.treasure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.midterm.model.SimpleTreasure;

/**
 * Tests the deliverPayment method and therefore the
 * getMoneyRemaining and removeMoney methods as well
 * @author James Luke Johnson
 * @version 2018.02.15
 */
class TestSimpleTreasureDeliverPayment {

	/**
	 * Test to confirm that deliverPayment empties the chest
	 * and getMoneyRemaining therefore returns 0
	 */
	@Test
	public void testDeliverPaymentShouldEmptyChest() {
		SimpleTreasure chest1 = new SimpleTreasure();
		chest1.deliverPayment();
		assertEquals(0, chest1.getMoneyRemaining());
	}
	
	/**
	 * Test to confirm that deliverPayment returns the full
	 * contents of the SimpleTreasure, 75
	 */
	@Test
	public void testDeliverPaymentShouldReturn75() {
		SimpleTreasure chest2 = new SimpleTreasure();
		assertEquals(75, chest2.deliverPayment());
	}

}
