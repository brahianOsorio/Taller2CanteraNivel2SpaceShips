package com.SpaceShips.domain;

import com.SpaceShips.domain.Abstract.SpaceVehicle;

public class UnmannedSpacecraft extends SpaceVehicle{

	private String fuel , mission ;
	private boolean missionState;
	
	
	
	public UnmannedSpacecraft(String fuel, String mission, boolean missionState,double power,double speed,double weight,String propulsionSystem) {
		this.fuel = fuel;
		this.mission = mission;
		this.missionState = missionState;
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



	public String getMission() {
		return mission;
	}



	public void setMission(String mission) {
		this.mission = mission;
	}



	public boolean isMissionState() {
		return missionState;
	}



	public void setMissionState(boolean missionState) {
		this.missionState = missionState;
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