package edu.albany.sandwich;

import java.util.Random;

public class Customer {

	private int count = 000;
	
	private int customerNum;
	private double cashOnHand;
	
	Random rand = new Random();
	private int sandwichSelection;
	
	
	public Customer() {
		
		customerNum = count++;
		cashOnHand = 0.0;
		sandwichSelection = rand.nextInt(10) + 1;
		
	}
	
	public Customer(double cash) {
		
		customerNum = count++;
		this.cashOnHand = cash;
		sandwichSelection = rand.nextInt(10) + 1;
		
	}
	
	public Customer(double cash, int selection) {
		
		customerNum = count++;
		this.cashOnHand = cash;
		this.sandwichSelection = selection;
		
	}
	
	public int getCustomerNum() {
		
		return customerNum;
		
	}
	
	public void setCustomerNum(int newNum) {
		
		customerNum = newNum;
		
	}
	
	public double getCashOnHand() {
		
		return cashOnHand;
		
	}
	
	public void setCashOnHand(double newCash) {
		
		cashOnHand = newCash;
		
	}
	
	public int getSandwichSelection() {
		
		return sandwichSelection;
		
	}
	
	public void setSandwichSelection(int newSelection) {
		
		sandwichSelection = newSelection;
		
	}
	
	
	/*
	public void placeOrder(Cashier c, Sandwich s) {
		
		if(this.cashOnHand >= s.getSandwichPrice()) {
			
			//c.makeTransaction();
			
		}
		
	}
	*/
	
}
