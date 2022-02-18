package com.SpaceShips.domain;

import com.SpaceShips.domain.Abstract.SpaceVehicle;

/**
 * Esta clase pertenece a las naves no tripuladas y contiene sus atributos y metodos 
 * 
 * UnmannedSpacecraft ship = new UnmannedSpacecraft();
 * ship.generateAlert();
 * 
 * @version 1.00.000 2022-02-18
 * 
 * @author Brahian Osorio 
 * 		   brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-02-18
 */

public class UnmannedSpacecraft extends SpaceVehicle{

	/**
	 * fuel representa el tipo de combustible. 
	 * mission representa la mision que esta haciendo la nave no tripulada. 
	 * name representa el nombre que tiene la nave no tripulada.
	 */
	private String fuel , mission , name  ;
	/**
	 * missionState representa el estado de la nave si esta activa o ya inactiva .
	 */
	private boolean missionState;
	
	
	/**
	 * Este es el costructor de la nave no tripulada 
	 * 
	 * @param name String es el nombre de la nave 
	 * @param fuel String es el combustible que tiene la nave
	 * @param mission String es la misiion que se le asigno ala nave 
	 * @param missionState boolean es es estado de la mision de la nave 
	 * @param power double es la potencia que tiene la nave 
	 * @param speed double es la velocidad que tiene la nave 
	 * @param weight double es el peso que tiene la nave 
	 * @param propulsionSystem String  es el sistema de propulsion de la nave 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public UnmannedSpacecraft(String name ,String fuel, String mission, boolean missionState,double power,double speed,double weight,String propulsionSystem) {
		this.name = name; 
		this.fuel = fuel;
		this.mission = mission;
		this.missionState = missionState;
		this.power = power;
		this.speed = speed;
		this.weight = weight;
		this.propulsionSystem = propulsionSystem;
		
	}
	
	
	/**
	 * este es el metodo get del name 
	 * 
	 * @return String  
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
	 * este es el metodo set del name 
	 * @param name Sring es el nuevo nombre de la nave
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
	 * este esel metodo get del combustible de la nave
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
	 * este es el metodo set del fuel 
	 * 
	 * @param fuel String esl nuevo combustible de la nave 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	/**
	 * este es el metodo get de la mision de la nave 
	 * @return mission String 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com	
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public String getMission() {
		return mission;
	}


	/**
	 * este es el set de la mision de la nave 
	 * 
	 * @param mission String este el la nueva mision que va a tener la nave 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public void setMission(String mission) {
		this.mission = mission;
	}


	/**
	 * este metodo nos muestra el estado de la mision 
	 * 
	 * @return missionState boolean 
	 * 
	 * @author Brahian Osorio 
	 * 		   brahianstiven.osorio@gmail.com
	 *
	 *@since 1.00.000 2022-02-18 
	 */
	public boolean isMissionState() {
		return missionState;
	}


	/**
	 * este metodo es el set  del estado de la mision de la nave
	 * 
	 * @param missionState boolean es el nuevo estado de la mision
	 * 
	 * @author Brahian Osorio 
	 * 	 	   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18 
	 */
	public void setMissionState(boolean missionState) {
		this.missionState = missionState;
	}


	/**
	 * este metodo permite conducir la nave 
	 * 
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
	 * este metodo permite orbitar a la nave 
	 * 
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
	 * este metodo permite establecer comunicacion con nave 
	 * 
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
	 * este metodo le permite a la nave tomar fotos  
	 * 
	 * @author Brahian Osorio
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public void takePhotos() {
		
		
	}
	/**
	 * este metodo le permite a la nave generar una alerta  
	 * 
	 * @author Brahian Osorio
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public void generateAlert() {
		
		
	}
	
	
}