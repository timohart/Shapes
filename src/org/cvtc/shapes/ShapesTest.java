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


		ShapeType Cuboid = null;
		Cuboid cuboid1 = (org.cvtc.shapes.Cuboid) factory.make(Cuboid);
		ShapeType Cylinder = null;
		Cylinder cylinder1 = (org.cvtc.shapes.Cylinder) factory.make(Cylinder);
		ShapeType Sphere = null;
		Sphere sphere1 = (org.cvtc.shapes.Sphere) factory.make(Sphere);
		
		cuboid1.render();
		cylinder1.render();
		sphere1.render();
	}

}
