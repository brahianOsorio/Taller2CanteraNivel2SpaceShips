package com.SpaceShips.App;

import com.SpaceShips.App.Interface.Menu;
import com.SpaceShips.domain.ShuttleVehicle;

/**
 * Esta clase contiene el menu para las naves de lanzadera
 * 
 * CreateMenuShuttleVehicle menu = new CreateMenuShuttleVehicle();
 * menu.start();
 * menu.createShuttleVehicle();
 * 
 * @version 1.00.000 2022-02-18
 * 
 * @author Brahian Osorio 
 * 		   brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 20222-02-18
 */

public class CreateMenuShuttleVehicle implements Menu {
	/**
	 * Esta variable Representa el tipo de combustible que tiene la lanzadera
	 */
	private String fuel;
	/**
	 * Esta variable representa el sistema de propulsion que tiene la lanzadera
	 */
	private String propulsionSystem;
	/**
	 * Esta variable Representa al nombre de la lanzadera
	 */
	private String name ;
	/**
	 * Esta variable representa La Capacidad de Trasporte que tiene la lanzadera
	 */
	private double transportCapacity;
	/**
	 * Esta variable representa la potencia que tiene la lanzadera
	 */
	private double power;
	/**
	 * Esta Variable Representa la velocidad que tiene la lanzadera
	 */
	private double speed;
	/**
	 * Esta variable representa el peso de la lanzadera
	 */
	private double weight;

	/**
	 * este metodo muestra el menu de inicio para crear una nave de lanzadera.
	 * 
	 * solo llamando el metodo el captura los datos necesarios para crear una nave de lanzadera.
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
			name = ValidatorMenu.getText("Ingrese el nombre de la nave ");
			fuel = ValidatorMenu.getText("Ingrese el Combustible que usa la lanzadera");
			transportCapacity =  ValidatorMenu.getNumber("Ingrese la capacidad de carga de la lanzadera");
			power = ValidatorMenu.getNumber("Ingrese la Potencia que tiene la lanzadera");
			speed = ValidatorMenu.getNumber("Ingrese la velocidad que tiene la lanzadera");
			weight = ValidatorMenu.getNumber("Ingrese el peso que tiene lanzadera");
			propulsionSystem = ValidatorMenu.getText("Ingrese el sistema de propulcion de la lanzadera");
			
			
		} catch (Exception exeption) {
			System.out.println(exeption.getMessage());
		}

	}
	/**
	 * Este metodo es para crear una instancia de la nave de lanzadera.
	 * 
	 * @return una instancia de ShuttleVehicle.
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public ShuttleVehicle createShuttleVehicle () {
		
		return new ShuttleVehicle(name,fuel, transportCapacity, power, speed, weight, propulsionSystem);
	}

}
