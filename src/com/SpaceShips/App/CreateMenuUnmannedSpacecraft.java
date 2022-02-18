package com.SpaceShips.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
	 * fuel variable representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva.
	 * propulsionSystem representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva. 
	 * mission representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva. 
	 * name representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva. 
	 */
	private String fuel, propulsionSystem, mission, name ;
	/**
	 * power representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva. 
	 * speed representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva. 
	 * weight representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva. 
	 */
	private double power, speed, weight;
	/**
	 * missionStateBoolean representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva. 
	 */
	private boolean missionStateBoolean;
	/**
	 * reader representa a la variable que va a leer los datos de la consola.
	 */
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
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
