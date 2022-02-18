package com.SpaceShips.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.SpaceShips.App.Interface.Menu;
import com.SpaceShips.domain.MannedSpacecraft;

public class CreateMenuMannedSpacecraft implements Menu{
	private String propulsionSystem, name;
	private int numbreOfpassengers;
	private double power, speed, weight ,orbitDistance ;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	@Override
	public void start() {
		try {
			System.out.println("Ingrese Nombre de la Nave ");
			name = reader.readLine();
			System.out.println("Ingrese el Numero de pasajeros que tiene la Nave Tripulada ");
			numbreOfpassengers = Integer.parseInt(reader.readLine());
			System.out.println("Ingrese Distancia ala que orbita la Nave Tripulada ");
			orbitDistance =  Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese la Potencia que tiene la  Nave Tripulada ");
			power = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese la velocidad que tiene la  Nave Tripulada ");
			speed = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese el peso que tiene  Nave Tripulada ");
			weight = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese el sistema de propulcion de la  Nave Tripulada ");
			propulsionSystem = reader.readLine();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public MannedSpacecraft createMannedSpacecraft() {
		return new MannedSpacecraft(name, numbreOfpassengers, orbitDistance, power, speed, weight, propulsionSystem);
	}

}
