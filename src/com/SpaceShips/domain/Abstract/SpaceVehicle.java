package com.SpaceShips.domain.Abstract;

public abstract class  SpaceVehicle {
	
	public double power, speed, weight ;
	public String propulsionSystem; 
	
	public abstract void Driving();
	
	public abstract void toOrbit();
	
	public abstract void communication();
	
	
	
}
