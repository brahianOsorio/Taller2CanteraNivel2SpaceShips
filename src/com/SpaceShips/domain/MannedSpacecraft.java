package com.SpaceShips.domain;

import com.SpaceShips.domain.Abstract.SpaceVehicle;

/**
 * Esta clase es la que pertenece las naves tripuladas sus atributos y sus metodos
 * 
 * MannedSpacecraft ship = new MannedSpacecraft();
 * ship.toOrbit();
 * 
 * @version 1.00.000 2022-02-18
 * 
 * @author Brahian Osorio 
 * 		   brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-02-18
 */

public class MannedSpacecraft extends SpaceVehicle {
	/**
	 * name representa al nombre de la nave.
	 */
	private String name;
	/**
	 * numbreOfpassengers representa al numero de pasajeros que puede tener la nave 
	 */
	private int numbreOfpassengers;
	/**
	 * orbitDistance representa la distancia al cual orbita la nave de la tierra 
	 */
	private double orbitDistance;
	
	/**
	 * Este es el costructor de la nave tripulada 
	 * 
	 * @param name String es el nombre de la nave 
	 * @param numbreOfpassengers int es el nuemro de pasajerosque tieen la nave 
	 * @param orbitDistance double es la distancia de la tierra ala que orbita la nave
	 * @param power double es la potencia que tiene la nave 
	 * @param speed double es la velocidad que tiene la nave 
	 * @param weight double es el peso de la nave 
	 * @param propulsionSystem String es el sistema de propulsion de la nave 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */ 
	public MannedSpacecraft(String name, int numbreOfpassengers, double orbitDistance, double power, double speed,
			double weight, String propulsionSystem) {
		this.name = name;
		this.numbreOfpassengers = numbreOfpassengers;
		this.orbitDistance = orbitDistance;
		this.power = power;
		this.speed = speed;
		this.weight = weight;
		this.propulsionSystem = propulsionSystem;
	}
	/**
	 * metodo get del name 
	 * @return name
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public String getName() {
		return name;
	}
	/**
	 * metodo set del name  
	 * @param name String el nuevo name de la nave 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * es el metodo de get del numero de pasajeros
	 * @return numbreOfpassengers 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public int getNumbreOfpassengers() {
		return numbreOfpassengers;
	}
	/**
	 * es el metodo set del numero de pasajeros
	 * @param numbreOfpassengers int es el nuevo numero de pasajeros
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public void setNumbreOfpassengers(int numbreOfpassengers) {
		this.numbreOfpassengers = numbreOfpassengers;
	}
	/**
	 * es el metodo de get del la distancia que orbita la nave a la tierra
	 * @return orbitDistance 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public double getOrbitDistance() {
		return orbitDistance;
	}
	/**
	 * es el metodo set del la distancia que orbita la nave a la tierra
	 * @param orbitDistance double es la nueva distancia a la que orbita la nave
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public void setOrbitDistance(double orbitDistance) {
		this.orbitDistance = orbitDistance;
	}
	
	/**
	 * el metodo que permite conducir una nave
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	@Override
	public void Driving() {
		// TODO Auto-generated method stub

	}
	/**
	 * el metodo que permite orbitar a la nave
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	@Override
	public void toOrbit() {
		// TODO Auto-generated method stub

	}
	/**
	 * el metodo que permite establecer comunicacion a la nave
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	@Override
	public void communication() {
		// TODO Auto-generated method stub

	}
	/**
	 * el metodo que permite recivir personas a la nave
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public void receivePeople() {

	}
	/**
	 * el metodo que permite despachar personas a la nave
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public void dispatchPeople() {
		
	}

}
