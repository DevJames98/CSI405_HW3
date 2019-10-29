package edu.albany.sandwich;

public class Cashier {

	private String cashierName;
	private int cashierNum;
	
	
	public Cashier() {
		
		cashierName = "";
		cashierNum = 0;
	}
	
	
	public Cashier(String name, int num) {
		
		this.cashierName = name;
		this.cashierNum = num;
		
	}
	
	
	public String getCashierName() {
		
		return cashierName;
		
	}
	
	public void setCashierName(String newName) {
		
		cashierName = newName;
		
	}
	
	public int getCashierNum() {
		
		return cashierNum;
		
	}
	
	public void setCashierNum(int newNum) {
		
		cashierNum = newNum;
		
	}
	
	/*
	public void verifyPurchase(Customer c) {
		
		cash = c.getCashOnHand();
		
		
		switch ()
		
	}
	
	*/
	
	
}
