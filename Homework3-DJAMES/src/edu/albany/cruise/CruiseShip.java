package edu.albany.cruise;

import edu.albany.ship.*;

public class CruiseShip extends Ship {

	//Creates field for the maximum number of passengers
	private int maxPassengers;
	
	//Creates default constructor
	public CruiseShip() {
		
		//Makes shipYear and buildYear empty strings + maxPassengers to 0
		this("","",0);
		//maxPassengers = 0;
		
	}
	
	//Creates constructor with the shipName, buildYear and the max amount of passengers
	public CruiseShip(String shipName, String buildYear, int maxPassengers) {
		
		//Sets the parameters that would be used in the parent class Ship
		super(shipName, buildYear);		//Not necessary since there is a default constructor, but done anyway
		this.maxPassengers = maxPassengers;
		
	}
	
	//Getters and Setters
	
	public int getMaxPassengers() {
		
		return maxPassengers;
		
	}
	
	public void setMaxPassengers(int max) {
		
		maxPassengers = max;
		
	}
	
	
	//Creates toString method (Override)
	@Override
	public void toString(Ship currentCruiseShip) {
		
		//Checks to see if the type cast is valid
		if(currentCruiseShip instanceof CruiseShip) {
			
			//Gets the name of the ship
			String name = currentCruiseShip.getShipName();
			//Gets the max passengers by doing a type cast
			int max = ((CruiseShip) currentCruiseShip).getMaxPassengers();
			
			//Displays the ship name and the maximum number of passengers
			System.out.println("Ship Name: " + name + "\nMaximum Number of Passengers: " + max);
			System.out.println("==============================================");
			
		}
		else {
			
			//Displays error message
			System.out.println("ERROR! INVALID TYPE!");
			
		}
		
	
	}
	
	
}
