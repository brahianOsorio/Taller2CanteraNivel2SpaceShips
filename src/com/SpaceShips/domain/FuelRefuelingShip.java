package com.SpaceShips.domain;

import com.SpaceShips.domain.Abstract.SpaceVehicle;


/**
 * ESta clse es la clase que pertenece alas naves recargadoras de combustible 
 * la cual posee los atributos y metodos de la nave 
 * 
 * FuelRefuelingShip ship = new FuelRefuelingShip();
 * ship.driving();
 * 
 * @version 1.00.000 2022-02-18
 * 
 * @author Brahian Osorio 
 * 		   brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-02-18
 */

public class FuelRefuelingShip extends SpaceVehicle {
	/**
	 * name representa al nombre que tiene la nave.
	 */
	private String name;
	/**
	 * fuelCapacity representa al peso que puede llevar de combustible la nave.
	 */
	private double fuelCapacity;
	
	/**
	 * Este es el costructor de la nave recargadora de combustible 
	 * 
	 * @param name String es el nombre de la nave 
	 * @param fuelCapacity double es la capacidad de combustible que tiene lanave para entregar 
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
	public FuelRefuelingShip(String name, double fuelCapacity,double power,double speed,double weight,String propulsionSystem) {
		this.name=name;
		this.fuelCapacity = fuelCapacity;
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
	 * el metodo de get de la capacidad de carga de combustible de la nave.
	 * @return fuelCapacity 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public double getFuelCapacity() {
		return fuelCapacity;
	}


	/**
	 * el metodo de set de la capacidad de carga de combustible de la nave.
	 * @param fuelCapacity double es la nueva capacidad de carga de combustible de la nave.
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
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
	 * el metodo que permite orbitar una nave
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
	 * el metodo que permite establecer comunicacion a una nave 
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
	 * este metodo permite a la nave recargar el combustible que lleva.
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18 
	 */
	public void Reload() {
		
	}

}
