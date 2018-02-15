package edu.westga.cs6312.midterm.model;

/**
 * Defines the Player class
 * @author James Luke Johnson
 * @version 2018.02.15
 */
public class Player {
	private int moneyRemaining;
	
	/**
	 * Constructs a new Player with 100 money units
	 */
	public Player() {
		this.moneyRemaining = 100;
	}
	
	/**
	 * Gets the amount of money units remaining
	 * @return	The current money units of the Player
	 */
	public int getMoneyRemaining() {
		return this.moneyRemaining;
	}
	
	/**
	 * Subtracts money units from the Player.
	 * Used to open Treasure Chests
	 * @param deduction	The amount of money to be deducted
	 * 
	 * Precondition: deduction > 0
	 * Postcondition: Player's moneyRemaining is decreased
	 */
	public void deductMoney(int deduction) {
		if (deduction < 0) {
			deduction = 0;
		}
		this.moneyRemaining -= deduction;
	}
	
	/**
	 * Adds money units to the Player.
	 * Used to award from Treasure Chests
	 * @param acceptance	The amount of money to be added
	 * 
	 * Precondition: acceptance > 0
	 * Postcondition: Player's moneyRemaining is increased
	 */
	public void acceptMoney(int acceptance) {
		if (acceptance < 0) {
			acceptance = 0;
		}
		this.moneyRemaining += acceptance;
	}
	
	/**
	 * Returns a one sentence description of the Player object
	 * @return	A String description
	 */
	@Override
	public String toString() {
		return "Player with " + this.getMoneyRemaining() + " money units remaining";
	}
}
