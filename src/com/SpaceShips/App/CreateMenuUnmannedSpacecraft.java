package com.SpaceShips.App;

import com.SpaceShips.App.Interface.Menu;
import com.SpaceShips.domain.UnmannedSpacecraft;

/**
 * Esta clase contiene el menu de las naves no tripuladas 
 * 
 * CreateMenuUnmannedSpacecraft menu = new CreateMenuUnmannedSpacecraft();
 * menu.start();
 * menu.CreateUnmannedSpacecraft();
 *  
 * @version 1.00.000 2022-02-18
 * 
 * @author Brahian Osorio 
 * 	 	   brahianstiven.osorio@gmail.com
 *@since 1.00.000 20222-02-18
 */

public class CreateMenuUnmannedSpacecraft implements Menu {
	/**
	 * Esta variable representa cobustible que usa la nave no tripulada.
	 */
	private String fuel;
	/**
	 *  Esta Variable representa el sistema de propuilcion que usa la nave no tripulada. 
	 */
	private String propulsionSystem;
	/**
	 * Esta Variable representa la  mision que tiene la nave no tripulada. 
	 */
	private String mission;
	/**
	 * Esta variable representa al nombre de la nave no tripulada.
	 */
	private String name;
	/**
	 * Esta variable representa la potencia de la nave no tripulada.
	 */
	private double power;
	/**
	 * Esta Variable representa la velocidad de la nave no tripulada.
	 */
	private double speed;
	/**
	 * Esta variable Representa al peso que tiene la nave no trulada.
	 */
	private double weight;
	/**
	 * missionStateBoolean representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva. 
	 */
	private boolean missionStateBoolean;

	/**
	 * este metodo muestra el menu de inicio para crear una nave no tripulada.
	 * 
	 * solo llamando el metodo el captura los datos necesarios para crear una nave no tripulada.
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
			name = ValidatorMenu.getText("Ingrese El Nombre de la Nave ");
			fuel = ValidatorMenu.getText("Ingrese el combustible que tiene la nave no tripulada");
			mission = ValidatorMenu.getText("Ingrese la mision que tiene la nave no tripulada");
			System.out.println("Estado de la mision ");
			System.out.println("1-> Activa ");
			System.out.println("2-> InActiva ");
			int missionState = (int)ValidatorMenu.getNumber("");
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
			power = ValidatorMenu.getNumber("Ingrese la Potencia que tiene la nave no tripulada");
			speed = ValidatorMenu.getNumber("Ingrese la velocidad que tiene la nave no tripulada");
			weight = ValidatorMenu.getNumber("Ingrese el peso que tiene la nave no tripulada");
			propulsionSystem = ValidatorMenu.getText("Ingrese el sistema de propulcion de la nave no tripulada");

		} catch (Exception exeption) {
			System.out.println(exeption.getMessage());
		}	

	}
	/**
	 * Este metodo es para crear una instancia de la nave no tripulada.
	 * 
	 * @return una instancia de UnmannedSpacecraft.
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public UnmannedSpacecraft CreateUnmannedSpacecraft() {
		
		return new UnmannedSpacecraft(name, fuel, mission, missionStateBoolean, power, speed, weight, propulsionSystem);
	}

}
