package edu.westga.cs6312.midterm.testing.treasure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.midterm.model.RandomTreasure;

/**
 * Tests the deliverPayment method from the RandomTreasure class
 * @author James Luke Johnson
 * @version 2018.02.18
 */
class TestRandomTreasureDeliverPayment {

	/**
	 * Test to confirm that a RandomTreasure will deliver a payment 
	 * between 1 and 100 money units.
	 * Should return true
	 * 
	 * NOTE: I know this isn't part of the assignment but I was curious if it would work
	 *		 If I change the assertEquals to different numbers, it returns a failure so I know it works.
	 */
	@Test
	void testDeliverPaymentReturnsRandomAmountBetween1and100ShouldReturnTrue() {
		for (int count = 0; count < 100; count++) {
			int payment = new RandomTreasure(new java.util.Random()).deliverPayment();
			assertEquals(true, payment > 0 && payment <= 100);
		}
	}

}
