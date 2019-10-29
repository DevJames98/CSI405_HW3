package edu.albany.sandwich;

public class SandwichMaker {

	
	private String sandwichMakerName;
	
	
	public SandwichMaker() {
		
		sandwichMakerName = "";
		
	}
	
	public SandwichMaker(String name) {
		
		this.sandwichMakerName = name;
		
	}
	
	public String getSandwichMakerName() {
		
		return sandwichMakerName;
		
	}
	
	public void setSandwichMakerName(String newName) {
		
		sandwichMakerName = newName;
		
	}
	
}
