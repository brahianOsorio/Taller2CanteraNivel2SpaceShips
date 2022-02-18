package com.SpaceShips.domain;

import com.SpaceShips.domain.Abstract.SpaceVehicle;

public class FuelRefuelingShip extends SpaceVehicle {
	private String name;
	private double fuelCapacity;
	
	
	
	public FuelRefuelingShip(String name, double fuelCapacity,double power,double speed,double weight,String propulsionSystem) {
		this.name=name;
		this.fuelCapacity = fuelCapacity;
		this.power = power;
		this.speed = speed;
		this.weight = weight;
		this.propulsionSystem = propulsionSystem;
	}

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getFuelCapacity() {
		return fuelCapacity;
	}



	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}



	@Override
	public void Driving() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void toOrbit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void communication() {
		// TODO Auto-generated method stub
		
	}
	
	public void Reload() {
		
	}

}
