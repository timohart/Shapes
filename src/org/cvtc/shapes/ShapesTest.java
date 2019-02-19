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
		MessageBox mb = new MessageBox();
		
		Cuboid cuboid1 = new Cuboid(mb, 1, 1, 1);
		Cylinder cylinder1 = new Cylinder(mb, 1, 1);
		Sphere sphere1 = new Sphere(mb, 1);
		
		cuboid1.render();
		cylinder1.render();
		sphere1.render();
	}

}
