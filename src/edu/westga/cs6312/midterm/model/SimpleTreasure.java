package edu.westga.cs6312.midterm.model;

/**
 * @author James Luke Johnson
 * @version 2018.02.15
 */
public class SimpleTreasure extends TreasureChest {
	
	public SimpleTreasure() {
		super(75);
	}
	
	public String toString() {
		return "a simple treasure chest holding " + this.getMoneyRemaining() + " money units";
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
