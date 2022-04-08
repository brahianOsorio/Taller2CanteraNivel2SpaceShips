package com.SpaceShips.domain.Abstract;

/**
 * ESta clase es la clase abstracta de la cual todas las clases del dominio
 * extienden
 * 
 * @version 1.00.000 2022-02-18
 * 
 * @author Brahian Osorio brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-02-18
 */

public abstract class SpaceVehicle {
	/**
	 * power representa la potencia de la nave.
	 */
	public double power;
	/**
	 * speed representa la velocidad de la nave.
	 */
	public double speed;
	/**
	 * weight representa el peso que tiene
	 * la nave.
	 */
	public double weight;
	/**
	 * propulsionSystem representa al sistema de propiulsion de la nave
	 */
	public String propulsionSystem;

	/**
	 * este metodo es el que se va a implementar en todos los vehiculos espaciales y
	 * permite condicirlos
	 * 
	 * @author Brahian Osorio brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public abstract void Driving();

	/**
	 * este metodo es el que se va a implementar en todos los vehiculos espaciales y
	 * permite orbitar
	 * 
	 * @author Brahian Osorio brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public abstract void toOrbit();

	/**
	 * este metodo es el que se va a implementar en todos los vehiculos espaciales y
	 * permite establecer comunicacion
	 * 
	 * @author Brahian Osorio brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-02-18
	 */
	public abstract void communication();

}
