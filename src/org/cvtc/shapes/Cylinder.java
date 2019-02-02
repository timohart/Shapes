/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Iimothy M. Hartwig
 *
 */
public class Cylinder extends Shape {
	
	private float radius = 0.0f;
	private float height = 0.0f;

	public Cylinder(float radius, float height) {
		super();
		setRadius(radius);
		setHeight(height);
	}

	/**
	 * @return the radius
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(float radius) {
		this.radius = validationNumber(radius);
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = validationNumber(height);
	}

	/* (non-Javadoc)
	 * @see org.cvtc.shapes.Shape#surfaceArea()
	 */
	@Override
	float surfaceArea() {
		return (float) (2 * Math.PI * this.radius * this.height + 2 * Math.PI * Math.pow(this.radius, 2));
	}

	/* (non-Javadoc)
	 * @see org.cvtc.shapes.Shape#volume()
	 */
	@Override
	float volume() {
		return (float) (Math.PI * Math.pow(this.radius, 2) * this.height);
	}

	/* (non-Javadoc)
	 * @see org.cvtc.shapes.Shape#render()
	 */
	@Override
	void render() {
		massageBoxSimple("The cylinder has a height of " + this.height + " units and a radius of " + this.radius + 
				" units.\n The cylinder has a surface area of " + surfaceArea() + " units squard and a volume of " + volume() + " units cubid.");
	}
	
	/**
	 * @param number
	 * @return Number that is a float if greater then 0 and 1 if not greater then 0.
	 */
	private static float validationNumber(float number) {
		if (number > 0) {
			return number;
		}
		massageBoxSimple("You have entered a incorrect value," + number + ", which is not larger then 0 and the value has been set to 1.0.");
		return 1.0f;
	}
	
	/**
	 * Creates a pop up the the provided message.
	 * @param message
	 */
	private static void massageBoxSimple(String message) {
		JOptionPane.showMessageDialog(null, message);
	
	}
}
