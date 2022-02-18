package com.SpaceShips.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.SpaceShips.App.Interface.Menu;
import com.SpaceShips.domain.FuelRefuelingShip;
import com.SpaceShips.domain.MannedSpacecraft;
import com.SpaceShips.domain.ShuttleVehicle;
import com.SpaceShips.domain.UnmannedSpacecraft;

/**
 * Esta clase contiene el menu principal de la aplicacion y es la que contiene
 * las instancias y las lista de los objetos que usa la aplicacion.
 * 
 * FirstMenu menu = new FirstMenu(); 
 * menu.start();
 * 
 * @version 1.00.001 2022-02-18
 *  
 * @author Brahian Osorio 
 * 		   brahianstiven.osorio@gmail.com
 *
 * @since 1.00.000 2022-02-18
 */

public class FirstMenu implements Menu {
	/**
	 * reader representa a la variable que va a leer los datos de la consola.
	 */
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	/**
	 * listMannedSpacecraft representa a la lista de naves tripuladas que se han creado.
	 */
	private ArrayList<MannedSpacecraft> listMannedSpacecraft = new ArrayList<MannedSpacecraft>();
	/**
	 * listShuttleVehicle representa a la lista de naves de lanzadera que se han creado.
	 */
	private ArrayList<ShuttleVehicle> listShuttleVehicle = new ArrayList<ShuttleVehicle>();
	/**
	 * listUnmannedSpacecraft representa a la lista de naves no tripuladas que se han creado.
	 */
	private ArrayList<UnmannedSpacecraft> listUnmannedSpacecraft = new ArrayList<UnmannedSpacecraft>();
	/**
	 * listFuelRefuelingShip representa a la lista de naves recargadoras de combustible que se han creado.
	 */
	private ArrayList<FuelRefuelingShip> listFuelRefuelingShip = new ArrayList<FuelRefuelingShip>();

	/**
	 * este metodo muestra el menu de inicio de la aplicacion.
	 * 
	 *toma la decicion del usuario y llama los respectivos metodos necesarios para satisfacer la necesidad 
	 * 
	 * @throws exeption esta exepcion por si hay un error en el bufer a la hora de leer ú otro error en la ejecucion.
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
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

				int option = Integer.parseInt(reader.readLine());

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
					CreateMenuFuelRefuelingShip menuFuelRefuelingShip = new CreateMenuFuelRefuelingShip();
					menuFuelRefuelingShip.start();
					listFuelRefuelingShip.add(menuFuelRefuelingShip.CreateFuelRefuelingShip());
					System.out.println("Se ha Creado La Nave Recargadora de Conbustible");

					break;
				case 5:
					
					System.out.println("Naves De lanzadera");
					if (listShuttleVehicle.isEmpty()) {
						System.out.println("No hay Naves De lanzadera ");
					} else {
						listShuttleVehicle.stream()
								.forEach((Ship) -> System.out.println(Ship.getName() + "El Combustuble: "
										+ Ship.getFuel() + " la capacidad de trasporte: " + Ship.getTransportCapacity()
										+ " la potencia: " + Ship.power + " la velocidad: " + Ship.speed + " El peso: "
										+ Ship.weight + " El Sistema de Propulsion: " + Ship.propulsionSystem));
					}
					
					
					System.out.println("Naves No Tripulada");
					if (listUnmannedSpacecraft.isEmpty()) {
						System.out.println("No hay Naves No Tripuladas ");
					} else {
						listUnmannedSpacecraft.stream()
								.forEach((Ship) -> System.out.println(Ship.getName() + "El Combustuble: "
										+ Ship.getFuel() + " la mision: " + Ship.getMission()
										+ " El Estado de la mision: " + Ship.isMissionState() + " la potencia: "
										+ Ship.power + " la velocidad: " + Ship.speed + " El peso: " + Ship.weight
										+ " El Sistema de Propulsion: " + Ship.propulsionSystem));
					}
					
					
					System.out.println("Naves Tripuladas");
					if (listMannedSpacecraft.isEmpty()) {
						System.out.println("No hay Naves Tripuladas ");
					} else {
						listMannedSpacecraft.stream()
								.forEach((Ship) -> System.out.println(Ship.getName() + "El Numero De Pasajeros: "
										+ Ship.getNumbreOfpassengers() + " la Distancia ala que orbita: "
										+ Ship.getOrbitDistance() + " la potencia: " + Ship.power + " la velocidad: "
										+ Ship.speed + " El peso: " + Ship.weight + " El Sistema de Propulsion: "
										+ Ship.propulsionSystem));
					}
					
					
					System.out.println("Naves Recargadoras de Conbustible");
					if (listFuelRefuelingShip.isEmpty()) {
						System.out.println("No hay Naves Recargadoras de Conbustible ");
					} else {
						listFuelRefuelingShip.stream()
								.forEach((Ship) -> System.out.println(Ship.getName()
										+ " LA Cantidad De Combustible Que Trae: " + Ship.getFuelCapacity()
										+ " la potencia: " + Ship.power + " la velocidad: " + Ship.speed + " El peso: "
										+ Ship.weight + " El Sistema de Propulsion: " + Ship.propulsionSystem));
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

		} catch (Exception exeption) {
			System.out.println(exeption.getMessage());
		}

	}

}
