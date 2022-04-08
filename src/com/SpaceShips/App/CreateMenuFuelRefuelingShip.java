package com.SpaceShips.App;

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
	 * Esta Variable representa El Sistema de propulcion de La nave Recargadora De Combustible 
	 */
	private String propulsionSystem;
	/**
	 * Esta Variable representa El nombre de La nave Recargadora De Combustible 
	 */
	private String name;
	/**
	 * Esta variable Representa La potencia de la Nave Recargadera de Conbustible
	 */
	private double power;
	/**
	 * Esta variable Representa la velocidad de la Nave Recargadera de Conbustible
	 */
	private double speed;
	/**
	 * Esta variable Representa el peso de la Nave Recargadera de Conbustible
	 */
	private double weight;
	/**
	 * Esta variable Representa la capacidad de carga de la Nave Recargadera de Conbustible
	 */
	private double fuelCapacity;

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
			name = ValidatorMenu.getText("Ingrese el nombre de la Nave");
			fuelCapacity = ValidatorMenu.getNumber("Ingrese la capacidad de contenido de combustible que puede llevar la Nave Recargadora de Conbustible  ");
			power = ValidatorMenu.getNumber("Ingrese la Potencia que tiene la Nave Recargadora de Conbustible ");
			speed = ValidatorMenu.getNumber("Ingrese la velocidad que tiene la Nave Recargadora de Conbustible ");
			weight = ValidatorMenu.getNumber("Ingrese el peso que tiene  Nave Recargadora de Conbustible  ");
			propulsionSystem = ValidatorMenu.getText("Ingrese el sistema de propulcion de la Nave Recargadora de Conbustible ");
	

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
