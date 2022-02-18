package com.SpaceShips.domain;

import com.SpaceShips.domain.Abstract.SpaceVehicle;

public class MannedSpacecraft extends SpaceVehicle {
	private String name;
	private int numbreOfpassengers;
	private double orbitDistance;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void receivePeople() {

	}
	
	public void dispatchPeople() {
		
	}

}
