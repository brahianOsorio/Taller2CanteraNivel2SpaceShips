package com.SpaceShips.domain;

import com.SpaceShips.domain.Abstract.SpaceVehicle;

public class ShuttleVehicle extends SpaceVehicle {
	
	private String fuel, name ;
	private double transportCapacity ;
	
	
	
	public ShuttleVehicle(String name , String fuel, double transportCapacity, double power,double speed,double weight,String propulsionSystem ) {
		this.name = name;
		this.fuel = fuel;
		this.transportCapacity = transportCapacity;
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



	public String getFuel() {
		return fuel;
	}



	public void setFuel(String fuel) {
		this.fuel = fuel;
	}



	public double getTransportCapacity() {
		return transportCapacity;
	}



	public void setTransportCapacity(double transportCapacity) {
		this.transportCapacity = transportCapacity;
	}



	public void TakeOff() {
		
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
	
	public void hookUpShip() {
		// TODO Auto-generated method stub
		
	}
	public void uncouplingShip() {
		// TODO Auto-generated method stub
		
	}

}
