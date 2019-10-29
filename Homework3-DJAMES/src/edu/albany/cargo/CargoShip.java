package edu.albany.cargo;

import edu.albany.ship.*;

public class CargoShip extends Ship{

	//Creates a field for the cargo capacity in tonnage
	private int cargoCapacity;
	
	//Creates default constructor
	public CargoShip() {
			
		//Makes shipYear and buildYear empty strings + cargoCapacity to 0
		this("","",0);
		//maxPassengers = 0;
			
	}
	
	//Creates constructor with the shipName, buildYear and the cargo capacity
	public CargoShip(String shipName, String buildYear, int cargoCapacity) {
			
		//Sets the parameters that would be used in the parent class Ship
		super(shipName, buildYear);		//Not necessary since there is a default constructor, but done anyway
		this.cargoCapacity = cargoCapacity;
			
	}
	
	//Getters and Setters
	
	public int getCargoCapacity() {
			
		return cargoCapacity;
			
	}
		
	public void setCargoCapacity(int capacity) {
			
		cargoCapacity = capacity;
			
	}
		
		
	//Creates toString method (Override)
	@Override
	public void toString(Ship currentCargoShip) {
			
		//Checks to see if the type cast is valid
		if(currentCargoShip instanceof CargoShip) {
				
			//Gets the name of the ship
			String name = currentCargoShip.getShipName();
			//Gets the cargo capacity by doing a type cast
			int capacity = ((CargoShip) currentCargoShip).getCargoCapacity();
				
			//Displays the ship name and the maximum number of passengers
			System.out.println("Ship Name: " + name + "\nCargo Capacity: " + capacity);
			System.out.println("==============================================");
				
		}
		else {
				
			//Displays error message
			System.out.println("ERROR! INVALID TYPE!");
				
		}
			
		
	}
	
	
}
