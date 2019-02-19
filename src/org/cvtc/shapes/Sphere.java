/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Iimothy M. Hartwig
 *
 */
public class Sphere extends Shape implements Render {
	
	private float radius = 0.0f;

	public Sphere(MessageBox messageBox, float radius) {
		super(messageBox);
		setRadius(radius);
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

	/* (non-Javadoc)
	 * @see org.cvtc.shapes.Shape#surfaceArea()
	 */
	@Override
	public float surfaceArea() {
		return (float) (4 * Math.PI * Math.pow(this.radius, 2));
	}

	/* (non-Javadoc)
	 * @see org.cvtc.shapes.Shape#volume()
	 */
	@Override
	public float volume() {
		return (float) (1.333 * Math.PI * Math.pow(this.radius, 3));
	}

	/* (non-Javadoc)
	 * @see org.cvtc.shapes.Shape#render()
	 */
	@Override
	public
	void render() {
		messageBox.show("The sphere has a radius of " + this.radius + 
				"units.\n The sphere has a surface area of " + surfaceArea() + " units squard and a volume of " + volume() + " units cubid.", "Render");
	}
	
	/**
	 * @param number
	 * @return Number that is a float if greater then 0 and 1 if not greater then 0.
	 */
	private static float validationNumber(float number) {
		if (number > 0) {
			return number;
		}
		messageBox.show("You have entered a incorrect value," + number + ", which is not larger then 0 and the value has been set to 1.0.", "Error");
		return 1.0f;
	}
}
