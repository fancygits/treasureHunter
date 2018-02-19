package edu.westga.cs6312.midterm.model;

import java.util.Random;

/**
 * Defines the RandomTreasure class for treasure with random money
 * @author James Luke Johnson
 * @version 2018.02.18
 */
public class RandomTreasure extends TreasureChest {
	private Random diceRoll;
	
	/**
	 * Constructs a new RandomTreasure chest of 100 money units
	 * @param diceRoll	A random number object
	 */
	public RandomTreasure(Random diceRoll) {
		super(100);
		this.diceRoll = diceRoll;
	}
	
	/**
	 * Returns a sentence describing the RandomTreasure object
	 * @return	A string description
	 */
	@Override
	public String toString() {
		return "random " + super.toString();
	}
	
	/**
	 * Removes a random amount of money from the chest, up to the total money remaining
	 * nextInt(bound) returns from 0 (inclusive) to moneyRemaining (exclusive) so I add 1. 
	 * @return	The amount of money removed from the chest
	 */
	public int deliverPayment() {
		return this.diceRoll.nextInt(this.getMoneyRemaining()) + 1;
	}
}
