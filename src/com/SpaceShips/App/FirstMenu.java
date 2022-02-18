package com.SpaceShips.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.SpaceShips.App.Interface.Menu;
import com.SpaceShips.domain.FuelRefuelingShip;
import com.SpaceShips.domain.MannedSpacecraft;
import com.SpaceShips.domain.ShuttleVehicle;
import com.SpaceShips.domain.UnmannedSpacecraft;

public class FirstMenu implements Menu {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private ArrayList<MannedSpacecraft> listMannedSpacecraft = new ArrayList<MannedSpacecraft>();
	private ArrayList<ShuttleVehicle> listShuttleVehicle = new ArrayList<ShuttleVehicle>();
	private ArrayList<UnmannedSpacecraft> listUnmannedSpacecraft = new ArrayList<UnmannedSpacecraft>();
	private ArrayList<FuelRefuelingShip> listFuelRefuelingShip = new ArrayList<FuelRefuelingShip>();
	
	@Override
	public void start() {

		try {
			System.out.println("Bienvenido A La Aplicacion Para Crear Naves Espaciales");

			boolean exit = false;
			while (!exit) {
				System.out.println("------------------------------------------------");
				System.out.println("1-> Crear una nave de lanzadera");
				System.out.println("2-> Crear una nave no tripulada");
				System.out.println("3-> Crear una nave tripulada");
				System.out.println("4-> Crear una nave Recargadora de Conbustible ");
				System.out.println("5-> Mostrar naves creadas ");
				System.out.println("6-> salir ");
				
				int option =Integer.parseInt( reader.readLine());

				switch (option) {
				case 1:
					CreateMenuShuttleVehicle menuShuttleVehicle = new CreateMenuShuttleVehicle();
					menuShuttleVehicle.start();
					listShuttleVehicle.add(menuShuttleVehicle.createShuttleVehicle());
					System.out.println("Se ha Creado La Lanzadera");
					break;
				case 2:
					CreateMenuUnmannedSpacecraft menuUnmannedSpacecraft = new CreateMenuUnmannedSpacecraft();
					menuUnmannedSpacecraft.start();
					listUnmannedSpacecraft.add(menuUnmannedSpacecraft.CreateUnmannedSpacecraft());
					System.out.println("Se ha Creado La Nave No Tripulada");
					break;
				case 3:
					CreateMenuMannedSpacecraft menuMannedSpacecraft = new CreateMenuMannedSpacecraft();
					menuMannedSpacecraft.start();
					listMannedSpacecraft.add(menuMannedSpacecraft.createMannedSpacecraft());
					System.out.println("Se ha Creado La Nave Tripulada");
					break;
				case 4:
					
					CreateMenuFuelRefuelingShip menuFuelRefuelingShip = new  CreateMenuFuelRefuelingShip();
					menuFuelRefuelingShip.start();
					listFuelRefuelingShip.add(menuFuelRefuelingShip.CreateFuelRefuelingShip());
					System.out.println("Se ha Creado La Nave Recargadora de Conbustible");
					
					break;
				case 5:
					System.out.println("Naves De lanzadera");
					if (listShuttleVehicle.isEmpty()) {
						System.out.println("No hay Naves De lanzadera ");
					} else {
						listShuttleVehicle.stream().forEach((Ship) -> System.out.println(  Ship.getName() +
								"El Combustuble: " + Ship.getFuel() + " la capacidad de trasporte: " + Ship.getTransportCapacity() 
								+ " la potencia: " + Ship.power + " la velocidad: " + Ship.speed +" El peso: " + Ship.weight +
								" El Sistema de Propulsion: " + Ship.propulsionSystem
								));
					}
					System.out.println("Naves No Tripulada");
					if (listUnmannedSpacecraft.isEmpty()) {
						System.out.println("No hay Naves No Tripuladas ");
					} else {
						listUnmannedSpacecraft.stream().forEach((Ship) -> System.out.println(  Ship.getName() +
								"El Combustuble: " + Ship.getFuel() + " la mision: " + Ship.getMission()  + " El Estado de la mision: "
								+ Ship.isMissionState() + " la potencia: " + Ship.power + " la velocidad: " + Ship.speed +" El peso: " + Ship.weight +
								" El Sistema de Propulsion: " + Ship.propulsionSystem
								));
					}
					System.out.println("Naves Tripuladas");
					if (listMannedSpacecraft.isEmpty()) {
						System.out.println("No hay Naves Tripuladas ");
					} else {
						listMannedSpacecraft.stream().forEach((Ship) -> System.out.println(  Ship.getName() +
								"El Numero De Pasajeros: " + Ship.getNumbreOfpassengers() + " la Distancia ala que orbita: " + Ship.getOrbitDistance() 
								+ " la potencia: " + Ship.power + " la velocidad: " + Ship.speed +" El peso: " + Ship.weight +
								" El Sistema de Propulsion: " + Ship.propulsionSystem
								));
					}
					System.out.println("Naves Recargadoras de Conbustible");
					if (listShuttleVehicle.isEmpty()) {
						System.out.println("No hay Naves Recargadoras de Conbustible ");
					} else {
						listFuelRefuelingShip.stream().forEach((Ship) -> System.out.println( Ship.getName() + 
								" El Cantidad De Combustible Que Trae: " + Ship.getFuelCapacity()  
								+ " la potencia: " + Ship.power + " la velocidad: " + Ship.speed +" El peso: " + Ship.weight +
								" El Sistema de Propulsion: " + Ship.propulsionSystem
								));
					}
					break;
				case 6:
					exit = true;
					break;
				default:
					System.out.println("debes elegir una opcion de 1 a 6 ");

					break;
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
