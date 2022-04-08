package com.SpaceShips.App;

import com.SpaceShips.App.Interface.Menu;
import com.SpaceShips.domain.MannedSpacecraft;

/**
 * esta clase contiene el menu de las naves tipuladas
 * 
 * CreateMenuMannedSpacecraft menu = new CreateMenuMannedSpacecraft();
 * menu.start();
 * menu.createMannedSpacecraft();
 * 
 * @version 1.00.000 2022-02-18
 * 
 * @author Brahian Osorio brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-02-18
 */

public class CreateMenuMannedSpacecraft implements Menu {
	/**
	 * Esta variable representa el sistema de propulcion de la nave tripulada
	 */
	private String propulsionSystem;
	/**
	 * Esta Variable Representa el nombre de la nave Tripulada.
	 */
	private String name;
	/**
	 * representa al dato que va proporcionar la facilidad para crear la instancia
	 * de la naver nueva.
	 */
	private int numbreOfpassengers;
	/**
	 * Esta variable representa la potencia que tiene la nave tripulada.
	 */
	private double power;
	/**
	 * Esta variable representa la velocidad de la nave tripulada.
	 */
	private double speed;
	/**
	 * Esta variable representa el peso que tiene la nave tripulada.
	 */
	private double weight;
	/**
	 * Esta variable representa la distancia ala que horbita la nave tripulada.
	 */
	private double orbitDistance;

	/**
	 * este metodo muestra el menu de inicio para crear una nave tripulada.
	 * 
	 * solo llamando el metodo el captura los datos necesarios para crear una nave
	 * tripulada.
	 * 
	 * @throws exeption esta exepcion por si hay un error en el bufer a la hora de
	 *                  leer.
	 * 
	 * @author Brahian Osorio brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	@Override
	public void start() {
		try {
			name = ValidatorMenu.getText("Ingrese Nombre de la Nave ");
			numbreOfpassengers = (int) ValidatorMenu
					.getNumber("Ingrese el Numero de pasajeros que tiene la Nave Tripulada ");
			orbitDistance = ValidatorMenu.getNumber("Ingrese Distancia ala que orbita la Nave Tripulada ");
			power = ValidatorMenu.getNumber("Ingrese la Potencia que tiene la  Nave Tripulada ");
			speed = ValidatorMenu.getNumber("Ingrese la velocidad que tiene la  Nave Tripulada ");
			weight = ValidatorMenu.getNumber("Ingrese el peso que tiene  Nave Tripulada ");
			propulsionSystem = ValidatorMenu.getText("Ingrese el sistema de propulcion de la  Nave Tripulada ");

		} catch (Exception exeption) {
			System.out.println(exeption.getMessage());
		}

	}

	/**
	 * Este metodo es para crear una instancia de la nave tripulada.
	 * 
	 * @return una instancia de MannedSpacecraft.
	 * 
	 * @author Brahian Osorio brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public MannedSpacecraft createMannedSpacecraft() {
		return new MannedSpacecraft(name, numbreOfpassengers, orbitDistance, power, speed, weight, propulsionSystem);
	}

}
