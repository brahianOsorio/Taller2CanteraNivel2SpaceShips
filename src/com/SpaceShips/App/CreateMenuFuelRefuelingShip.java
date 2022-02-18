package com.SpaceShips.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.SpaceShips.App.Interface.Menu;
import com.SpaceShips.domain.FuelRefuelingShip;

/**
 * Esta clase es el menu de opciones que tienen las naves para ercargar combustible 
 * 
 * CreateMenuFuelRefuelingShip menuFuelRefuelingShip = new  CreateMenuFuelRefuelingShip();
 * menuFuelRefuelingShip.start();
 * listFuelRefuelingShip.add(menuFuelRefuelingShip.CreateFuelRefuelingShip());
 * 
 * @version 1.00.000 2022-02-18
 * 
 * @author Brahian Osorio
 * 		   brahianstiven.osorio@gmail.com
 *
 * @since 1.00.000 2022-02-18
 */

public class CreateMenuFuelRefuelingShip implements Menu {
	/**
	 * representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva.
	 */
	private String propulsionSystem, name;
	/**
	 * representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva.
	 */
	private double power, speed, weight, fuelCapacity;
	/**
	 * reader representa a la variable que va a leer los datos de la consola.
	 */
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	
	/**
	 * este metodo muestra el menu de inicio para crear una nave recargadora de combustible.
	 * 
	 * solo llamando el metodo el captura los datos necesarios para crear una nave recargadora de combustible
	 * 
	 * @throws exeption esta exepcion por si hay un error en el bufer a la hora de leer.
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	@Override
	public void start() {
		try {
			System.out.println("Ingrese el nombre de la Nave   ");
			name = reader.readLine();
			System.out.println(
					"Ingrese la capacidad de contenido de combustible que puede llevar la Nave Recargadora de Conbustible  ");
			fuelCapacity = Double.parseDouble(reader.readLine());
			System.out.println("Ingrese la Potencia que tiene la Nave Recargadora de Conbustible ");
			power = Double.parseDouble(reader.readLine());
			System.out.println("Ingrese la velocidad que tiene la Nave Recargadora de Conbustible ");
			speed = Double.parseDouble(reader.readLine());
			System.out.println("Ingrese el peso que tiene  Nave Recargadora de Conbustible  ");
			weight = Double.parseDouble(reader.readLine());
			System.out.println("Ingrese el sistema de propulcion de la Nave Recargadora de Conbustible ");
			propulsionSystem = reader.readLine();

		} catch (Exception exeption) {
			System.out.println(exeption.getMessage());
		}

	}
	
	
	/**
	 * Este metodo es para crear una instancia de la nave recargadora de combustible.
	 * 
	 * @return una instancia de FuelRefuelingShip.
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public FuelRefuelingShip CreateFuelRefuelingShip() {
		
		return new FuelRefuelingShip(name, fuelCapacity, power, speed, weight, propulsionSystem);
	}

}
