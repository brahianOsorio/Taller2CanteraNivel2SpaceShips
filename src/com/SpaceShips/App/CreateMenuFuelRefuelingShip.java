package com.SpaceShips.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.SpaceShips.App.Interface.Menu;
import com.SpaceShips.domain.FuelRefuelingShip;

public class CreateMenuFuelRefuelingShip implements Menu{

	private String propulsionSystem , name ;
	private double power, speed, weight , fuelCapacity ;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	@Override
	public void start() {
		try {
			System.out.println("Ingrese el nombre de la Nave   ");
			name =  reader.readLine(); 
			System.out.println("Ingrese la capacidad de contenido de combustible que puede llevar la Nave Recargadora de Conbustible  ");
			fuelCapacity =  Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese la Potencia que tiene la Nave Recargadora de Conbustible ");
			power = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese la velocidad que tiene la Nave Recargadora de Conbustible ");
			speed = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese el peso que tiene  Nave Recargadora de Conbustible  ");
			weight = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese el sistema de propulcion de la Nave Recargadora de Conbustible ");
			propulsionSystem = reader.readLine();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public FuelRefuelingShip CreateFuelRefuelingShip() {
		return new FuelRefuelingShip(name, fuelCapacity, power, speed, weight, propulsionSystem);
	}

}
