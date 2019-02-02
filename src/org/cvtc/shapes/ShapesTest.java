/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Timothy M Hartwig
 *
 */
public class ShapesTest {

	/**
	 * @param args
	 * 
	 * This is the main method to test the shape object. 
	 * 
	 */
	public static void main(String[] args) {
		Cuboid cuboid1 = new Cuboid(1, 1, 1);
		Cylinder cylinder1 = new Cylinder(1, 1);
		Sphere sphere1 = new Sphere(1);
		
		cuboid1.render();
		cylinder1.render();
		sphere1.render();
	}

}
