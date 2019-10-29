package edu.albany.sandwich;

public class Sandwich {

	
	private String sandwichName;
	private double sandwichPrice;
	private int waitTime;
	private int selectionNum;
	
	
	public Sandwich() {
		
		sandwichName = "";
		sandwichPrice = 0.0;
		waitTime = 0;
		selectionNum = 0;
		
	}
	
	public Sandwich(String name, double price, int waitTime, int selectionNum) {
		
		this.sandwichName = name;
		this.sandwichPrice = price;
		this.waitTime = waitTime;
		this.selectionNum = selectionNum;
		
	}
	
	public String getSandwichName() {
		
		return sandwichName;
		
	}
	
	public void setSandwichName(String newName) {
		
		sandwichName = newName;
		
	}
	
	public double getSandwichPrice() {
		
		return sandwichPrice;
		
	}
	
	public void setSandwichPrice(double newPrice) {
		
		sandwichPrice = newPrice;
		
	}
	
	public int getWaitTime() {
		
		return waitTime;
		
	}
	
	public void setWaitTime(int newWaitTime) {
		
		waitTime = newWaitTime;
		
	}
	
	public int getSelectionNum() {
		
		return selectionNum;
		
	}
	
	public void setSelectionNum(int newNum) {
		
		selectionNum = newNum;
		
	}
	
}
