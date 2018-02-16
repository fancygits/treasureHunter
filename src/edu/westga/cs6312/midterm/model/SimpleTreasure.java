package edu.westga.cs6312.midterm.model;

/**
 * Defines the SimpleTreasure subclass of TreasureChest
 * @author James Luke Johnson
 * @version 2018.02.15
 */
public class SimpleTreasure extends TreasureChest {
	
	/**
	 * Constructs a simple treasure chest with 75 money units
	 */
	public SimpleTreasure() {
		super(75);
	}
	
	/**
	 * Returns a sentence describing the SimpleTreasure object
	 * @return	A string description
	 */
	@Override
	public String toString() {
		if (this.getMoneyRemaining() == 0) {
			return "no treasure";
		} else {
			return "simple " + super.toString();
		}
	}
	
	/**
	 * Removes all money units from the chest and delivers it to the caller
	 * @return	The treasure from the chest
	 */
	public int deliverPayment() {
		int payment = this.getMoneyRemaining();
		this.removeMoney(payment);
		return payment;
	}
}
