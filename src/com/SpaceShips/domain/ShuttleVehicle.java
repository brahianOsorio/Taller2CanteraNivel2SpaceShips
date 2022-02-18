package com.SpaceShips.domain;

import com.SpaceShips.domain.Abstract.SpaceVehicle;

/**
 * Esta clase pertenece al las naves de lanzadera la cual contiene sus atributos y sus metodos
 * 
 * ShuttleVehicle ship =new ShuttleVehicle ();
 * ship.hookUpShip();
 * 
 * @version 1.00.000 2022-02-18
 * 
 * @author Brahian Osorio 
 * 		   brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-02-18
 */

public class ShuttleVehicle extends SpaceVehicle {
	/**
	 * fuel representa al tipo de combustible que tiene la nave.
	 * name representa el nombre de la nave.
	 */
	private String fuel, name ;
	/**
	 * transportCapacity representa la capacidad que tiene la nave de trasportar el en peso.
	 */
	private double transportCapacity ;
	
	
	/**
	 * Este es el constructor de la una lanzadera
	 * 
	 * @param name String es el nombre de la lanzadera
	 * @param fuel String es el combustible que usa la lanzadera
	 * @param transportCapacity double es la capacidad que tiene la lanzadera de trasportar un peso 
	 * @param power double es la potencia que tiene la nave
	 * @param speed double es la velocidad que tiene la nave 
	 * @param weight double es el peso que tiene la nave 
	 * @param propulsionSystem String es el sistema de propulcion que tiene la nave 
	 * 
	 *  @author Brahian Osorio 
	 *  		brahianstiven.osorio@gmail.com
	 *  
	 *  @since 1.00.000 2022-02-18 
	 */
	public ShuttleVehicle(String name , String fuel, double transportCapacity, double power,double speed,double weight,String propulsionSystem ) {
		this.name = name;
		this.fuel = fuel;
		this.transportCapacity = transportCapacity;
		this.power = power;
		this.speed = speed;
		this.weight = weight;
		this.propulsionSystem = propulsionSystem;
				
	}
	
	
	/**
	 *el metodo get del name  
	 * @return name String 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public String getName() {
		return name;
	}


	/**
	 * es el metodo set del name
	 * 
	 * @param name String es el nuevo nombre de la nave
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * es el metodo get del combustible de la nave 
	 * @return fuel String 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public String getFuel() {
		return fuel;
	}


	/**
	 * Es el metodo set de el combustible.
	 * 
	 * @param fuel String es el nuevo combustible que va usar nave 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 * 
	 */
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	/**
	 * Es el metodo get de la capacidad de trasporte de la lanzadera
	 * @return transportCapacity double 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public double getTransportCapacity() {
		return transportCapacity;
	}


	/**
	 * Es el metodo set de la capacidad de trasporte de la lanzadera
	 * @param transportCapacity double es la nueva capacidad de trasporte de la lazadera
	 * 
	 * @author Brahian Osorio
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public void setTransportCapacity(double transportCapacity) {
		this.transportCapacity = transportCapacity;
	}


	/**
	 * Es el metodo para despegar de la lanzadera 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 * 
	 */
	public void TakeOff() {
		
	}
	/**
	 * Es el metodo para conducir una lanzadera 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 * 
	 */
	@Override
	public void Driving() {
		// TODO Auto-generated method stub
	}
	/**
	 * Es el metodo para orbitar una lanzadera 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 * 
	 */
	@Override
	public void toOrbit() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Es el metodo que permite establecer una comunicacion con lanzadera 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 * 
	 */
	@Override
	public void communication() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * el metodo que permite enganchar una nave a la lanzadera
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public void hookUpShip() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * El metodo permite desenganchar una nave de la lanzadera.
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public void uncouplingShip() {
		// TODO Auto-generated method stub
		
	}

}
