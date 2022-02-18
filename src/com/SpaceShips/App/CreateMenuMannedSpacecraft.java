package com.SpaceShips.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
 * @author Brahian Osorio
 * 		   brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-02-18 
 */

public class CreateMenuMannedSpacecraft implements Menu{
	/**
	 * representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva.
	 */
	private String propulsionSystem, name;
	/**
	 * representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva.
	 */
	private int numbreOfpassengers;
	/**
	 * representa al dato que va proporcionar la facilidad para crear la instancia de la naver nueva.
	 */
	private double power, speed, weight ,orbitDistance ;
	/**
	 * reader representa a la variable que va a leer los datos de la consola.
	 */
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * este metodo muestra el menu de inicio para crear una nave tripulada.
	 * 
	 * solo llamando el metodo el captura los datos necesarios para crear una nave tripulada.
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
			System.out.println("Ingrese Nombre de la Nave ");
			name = reader.readLine();
			System.out.println("Ingrese el Numero de pasajeros que tiene la Nave Tripulada ");
			numbreOfpassengers = Integer.parseInt(reader.readLine());
			System.out.println("Ingrese Distancia ala que orbita la Nave Tripulada ");
			orbitDistance =  Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese la Potencia que tiene la  Nave Tripulada ");
			power = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese la velocidad que tiene la  Nave Tripulada ");
			speed = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese el peso que tiene  Nave Tripulada ");
			weight = Double.parseDouble(reader.readLine()); 
			System.out.println("Ingrese el sistema de propulcion de la  Nave Tripulada ");
			propulsionSystem = reader.readLine();
			
			
		} catch (Exception exeption) {
			System.out.println(exeption.getMessage());
		}

	}
	
	/**
	 * Este metodo es para crear una instancia de la nave tripulada.
	 * 
	 * @return una instancia de MannedSpacecraft.
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public MannedSpacecraft createMannedSpacecraft() {
		return new MannedSpacecraft(name, numbreOfpassengers, orbitDistance, power, speed, weight, propulsionSystem);
	}

}
