package edu.westga.cs6312.midterm.testing.treasure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.midterm.model.SimpleTreasure;

/**
 * Tests the SimpleTreasure constructor
 * @author James Luke Johnson
 * @version 2018.02.15
 */
class TestSimpleTreasureConstructor {

	/**
	 * Test to confirm that the 0-Parameter constructor creates a 
	 * TreasureChest with 75 money units
	 */
	@Test
	void test0ParameterConstructorShouldReturnNewTreasureChestWith75MoneyUnits() {
		SimpleTreasure newChest = new SimpleTreasure();
		assertEquals("a simple treasure chest holding 75 money units", newChest.toString());
	}

}
