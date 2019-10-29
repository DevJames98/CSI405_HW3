package edu.albany.ship;

public class Ship {

	//Create field for the name of the ship
	private String shipName;
	//Create field for the year that the ship was built
	private String buildYear;
	
	//Create default constructor
	public Ship() {
		
		shipName = "";
		buildYear = "";
		
	}
	
	//Create constructor with parameters for the name of the ship + build year
	public Ship(String name, String year) {
		
		this.shipName = name;
		this.buildYear = year;
		
		
	}
	
	//Getters and Setters
	//shipName Accessor + Mutator
	public String getShipName() {
		
		return shipName;
		
	}
	
	public void setStringName(String name) {
		
		shipName = name;
		
	}
	
	//buildYear Accessor + Mutator
	public String getBuildYear() {
		
		return buildYear;
		
	}
	
	public void setBuildYear(String year) {
		
		buildYear = year;
		
	}
	
	
	//Creates toString method to display shipName + buildYear
	public void toString(Ship currentShip) {
		
		//Calls methods to get respective field values
		String name = currentShip.getShipName();
		String year = currentShip.getBuildYear();
		
		//Displays both ship name and the build year of the ship
		System.out.println("Ship Name: " + name + "\nBuild Year: " + year);
		System.out.println("==============================================");
		
	}
	
	
}
