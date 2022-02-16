package com.SpaceShips.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.SpaceShips.App.Interface.Menu;
import com.SpaceShips.domain.MannedSpacecraft;
import com.SpaceShips.domain.ShuttleVehicle;
import com.SpaceShips.domain.UnmannedSpacecraft;

public class FirstMenu implements Menu {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private String option;
	private ArrayList<MannedSpacecraft> listMannedSpacecraft = new ArrayList<MannedSpacecraft>();
	private ArrayList<ShuttleVehicle> listShuttleVehicle = new ArrayList<ShuttleVehicle>();
	private ArrayList<UnmannedSpacecraft> listUnmannedSpacecraft = new ArrayList<UnmannedSpacecraft>();
	@Override
	public void start() {

		try {
			System.out.println("Bienvenido A La Aplicacion Para Crear Naves Espaciales");

			boolean exit = false;
			while (!exit) {
				System.out.println("");
				System.out.println("1-> Crear una nave de lanzadera");
				System.out.println("2-> Crear una nave no tripulada");
				System.out.println("3-> Crear una nave tripulada");
				System.out.println("4-> mostrar naves creadas ");
				option = reader.readLine();

				switch (option) {
				case "1":
					
					break;
				case "2":

					break;
				case "3":

					break;
				case "4":

					break;

				default:

					break;
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
