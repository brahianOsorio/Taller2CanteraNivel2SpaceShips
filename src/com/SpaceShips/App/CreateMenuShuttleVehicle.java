package com.SpaceShips.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
	 * representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva.
	 */
	private String fuel,propulsionSystem, name ;
	/**
	 * representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva.
	 */
	private double transportCapacity , power, speed, weight ;
	/**
	 * reader representa a la variable que va a leer los datos de la consola.
	 */
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

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
			System.out.println("Ingrese el nombre de la nave ");
			name = reader.readLine();
			System.out.println("Ingrese el Combustible que usa la lanzadera");
			fuel = reader.readLine();
			System.out.println("Ingrese la capacidad de carga de la lanzadera");
			transportCapacity =  Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese la Potencia que tiene la lanzadera");
			power = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese la velocidad que tiene la lanzadera");
			speed = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese el peso que tiene lanzadera");
			weight = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese el sistema de propulcion de la lanzadera");
			propulsionSystem = reader.readLine();
			
			
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
