package edu.westga.cs6312.midterm.testing.treasure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.midterm.model.RandomTreasure;


/**
 * Tests the constructor and toString method for the RandomTreasure object
 * @author James Luke Johnson
 * @version 2018.02.18
 */
class TestRandomTreasureConstructor {

	/**
	 * Test to confirm that the 1-Parameter constructor constructs a TreasureChest with 
	 * 100 money units
	 */
	@Test
	void testRandomTreasureConstructorShouldContain100MoneyUnits() {
		RandomTreasure treasure1 = new RandomTreasure(new java.util.Random());
		assertEquals("random treasure chest holding 100 money units", treasure1.toString());
	}

}
