package edu.westga.cs6312.midterm.model;

/**
 * Defines the abstract TreasureChest class
 * @author James Luke Johnson
 * @version 2018.02.15
 */
public abstract class TreasureChest {
	private int treasure;
	
	/**
	 * Constructs a new TreasureChest
	 * @param contents	The amount of money units in the chest
	 */
	public TreasureChest(int treasure) {
		this.treasure = treasure;
	}
	
	/**
	 * Gets the amount of money units remaining in the chest
	 * @return	The remaining money units
	 */
	public int getMoneyRemaining() {
		return this.treasure;
	}
	
	/**
	 * Removes money units from the TreasureChest
	 * @param moneyToRemove	The amount of money to remove
	 * 
	 * Precondition:	moneyToRemove <= treasure
	 * Postcondition:	money units removed from chest
	 */
	public void removeMoney(int moneyToRemove) {
		if (moneyToRemove > this.treasure) {
			throw new IllegalArgumentException("You can't remove more money than the chest contains");
		}
		this.treasure -= moneyToRemove;
	}
	
	/**
	 * Returns a String representation of the treasure chest
	 * @return	A String sentence of the chest
	 */
	@Override
	public String toString() {
		return "a treasure chest holding " + this.getMoneyRemaining() + " money units";
	}
	
	/**
	 * Returns the number of money units to be taken of the treasure chest
	 * @return	Number of money units to be taken
	 */
	public abstract int deliverPayment();
}
