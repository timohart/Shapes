/**
 * 
 */
package org.cvtc.shapes;

import org.cvtc.support.DialogOptions;

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
		ShapeFactory factory = new ShapeFactory(new DialogOptions(
				ShapeType.values(),
				"What shape do you wish to make?",
				"Shape Factory"));


		Cuboid cuboid1 = (Cuboid) factory.make((ShapeType) factory.getDialog().show());
		Cylinder cylinder1 = new Cylinder(mb, 1, 1);
		Sphere sphere1 = new Sphere(mb, 1);
		
		cuboid1.render();
		cylinder1.render();
		sphere1.render();
	}

}
