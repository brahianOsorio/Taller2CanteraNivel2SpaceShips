package com.SpaceShips.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.SpaceShips.App.Interface.Menu;
import com.SpaceShips.domain.ShuttleVehicle;

public class CreateMenuShuttleVehicle implements Menu {
	private String fuel,propulsionSystem, name ;
	private double transportCapacity , power, speed, weight ;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	@Override
	public void start() {
		try {
			System.out.println("Ingrese el nombre de la nave ");
			name = reader.readLine();
			System.out.println("Ingrese el Combustible que usa la lanzadera");
			fuel = reader.readLine();
			System.out.println("Ingrese la capacidad de carga de la lanzadera");
			transportCapacity =  Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese la Potencia que tiene la lanzadera");
			power = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese la velocidad que tiene la lanzadera");
			speed = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese el peso que tiene lanzadera");
			weight = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese el sistema de propulcion de la lanzadera");
			propulsionSystem = reader.readLine();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public ShuttleVehicle createShuttleVehicle () {
		
		return new ShuttleVehicle(name,fuel, transportCapacity, power, speed, weight, propulsionSystem);
	}

}
