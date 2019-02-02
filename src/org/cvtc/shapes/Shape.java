/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Iimothy M. Hartwig
 *
 */
public abstract class Shape {
	/**
	 * Calculate the surface area of the shape and return the surface area.
	 * @return the surface area of the shape
	 */
	abstract float surfaceArea();
	
	/**
	 * Calculate the volume of the shape and return the volume.
	 * @return the volume of the shape
	 */
	abstract float volume();
	
	/**
	 * Displays a pop up with the shape information such as detention, surface area, and volume.
	 */
	abstract void render();
}
