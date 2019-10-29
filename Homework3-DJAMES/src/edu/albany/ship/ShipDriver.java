package edu.albany.ship;

import edu.albany.cargo.CargoShip;
import edu.albany.cruise.CruiseShip;

public class ShipDriver {

	//MAIN METHOD
	public static void main(String[] args) {
			
		//Create Ship Array to hold the 6 ships
		Ship [] shipArray = new Ship[6];
			
		//Creates two Ships
		Ship ship1 = new Ship("Titanic","1911");
		Ship ship2 = new Ship("USS Monitor","1861");
			
		//Creates two CruiseShips
		CruiseShip ship3 = new CruiseShip("Queen Mary","1934",2139);
		CruiseShip ship4 = new CruiseShip("Harmony of the Seas","2016",6780);
			
		//Creates two CargoShips
		CargoShip ship5 = new CargoShip("Panamax","2016",13000);
		CargoShip ship6 = new CargoShip("Mary Celeste","1861",282);
			
		//Add Ships to the Ship Array
		shipArray[0] = ship1;
		shipArray[1] = ship2;
		shipArray[2] = ship3;
		shipArray[3] = ship4;
		shipArray[4] = ship5;
		shipArray[5] = ship6;
			
		//Iterate through shipArray, calling the toString() method
		for(Ship s : shipArray) {
				
			s.toString(s);
				
		}

	}
}
