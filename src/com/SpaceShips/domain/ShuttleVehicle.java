package com.SpaceShips.domain;

public class ShuttleVehicle extends SpaceVehicle {
	
	private String fuel;
	private double transportCapacity ;
	
	
	
	public ShuttleVehicle(String fuel, double transportCapacity, double power,double speed,double weight,String propulsionSystem ) {
		this.fuel = fuel;
		this.transportCapacity = transportCapacity;
		this.power = power;
		this.speed = speed;
		this.weight = weight;
		this.propulsionSystem = propulsionSystem;
				
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

}
