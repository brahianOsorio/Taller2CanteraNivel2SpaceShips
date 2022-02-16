package com.SpaceShips.domain;

import com.SpaceShips.domain.Abstract.SpaceVehicle;

public class MannedSpacecraft extends SpaceVehicle{

	private int numbreOfpassengers;
	private double orbitDistance;
	
	
	
	public MannedSpacecraft(int numbreOfpassengers, double orbitDistance, double power,double speed,double weight,String propulsionSystem) {
		this.numbreOfpassengers = numbreOfpassengers;
		this.orbitDistance = orbitDistance;
		this.power = power;
		this.speed = speed;
		this.weight = weight;
		this.propulsionSystem = propulsionSystem;
	}
	
	

	public int getNumbreOfpassengers() {
		return numbreOfpassengers;
	}



	public void setNumbreOfpassengers(int numbreOfpassengers) {
		this.numbreOfpassengers = numbreOfpassengers;
	}



	public double getOrbitDistance() {
		return orbitDistance;
	}



	public void setOrbitDistance(double orbitDistance) {
		this.orbitDistance = orbitDistance;
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
