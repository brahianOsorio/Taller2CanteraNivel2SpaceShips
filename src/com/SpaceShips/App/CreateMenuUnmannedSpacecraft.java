package com.SpaceShips.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.SpaceShips.App.Interface.Menu;
import com.SpaceShips.domain.UnmannedSpacecraft;

public class CreateMenuUnmannedSpacecraft implements Menu {

	private String fuel, propulsionSystem, mission, name ;
	private double power, speed, weight;
	private boolean missionStateBoolean;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	@Override
	public void start() {
		try {
			System.out.println("Ingrese El Nombre de la Nave ");
			name = reader.readLine();
			System.out.println("Ingrese el combustible que tiene la nave no tripulada");
			fuel = reader.readLine();
			System.out.println("Ingrese la mision que tiene la nave no tripulada");
			mission = reader.readLine();
			System.out.println("Estado de la mision ");
			System.out.println("1-> Activa ");
			System.out.println("2-> InActiva ");
			int missionState = Integer.parseInt(reader.readLine());
			switch (missionState) {
			case 1:
				missionStateBoolean = true;
				break;
			case 2:
				missionStateBoolean = false;
				break;

			default:
				System.out.println("debes elegir una opcion 1 ó 2 ");
				break;
			}
			
			System.out.println("Ingrese la Potencia que tiene la nave no tripulada");
			power = Double.parseDouble(reader.readLine());
			System.out.println("Ingrese la velocidad que tiene la nave no tripulada");
			speed = Double.parseDouble(reader.readLine());
			System.out.println("Ingrese el peso que tiene la nave no tripulada");
			weight = Double.parseDouble(reader.readLine());
			System.out.println("Ingrese el sistema de propulcion de la nave no tripulada");
			propulsionSystem = reader.readLine();

		} catch (Exception e) {
			System.out.println(e);
		}	

	}
	
	public UnmannedSpacecraft CreateUnmannedSpacecraft() {
		
		return new UnmannedSpacecraft(name, fuel, mission, missionStateBoolean, power, speed, weight, propulsionSystem);
	}

}
