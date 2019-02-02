/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Iimothy M. Hartwig
 *
 */
public class Cuboid extends Shape {
	
	private float depth = 0.0f;
	private float height =  0.0f;
	private float width = 0.0f;
	
	public Cuboid(float depth, float height, float width) {
		super();
		setDepth(depth);
		setHeight(height);
		setWidth(width);
	}

	/* (non-Javadoc)
	 * @see org.cvtc.shapes.Shape#surfaceArea()
	 */
	@Override
	float surfaceArea() {
		return 2 * (this.width * this.height + this.width * this.depth + this.depth * this.height);
	}

	/* (non-Javadoc)
	 * @see org.cvtc.shapes.Shape#volume()
	 */
	@Override
	float volume() {
		return this.depth * this.height * this.width;
	}

	/* (non-Javadoc)
	 * @see org.cvtc.shapes.Shape#render()
	 */
	@Override
	void render() {
		massageBoxSimple("Cuboid has a depth of " + this.depth + " units, a height of " + this.height + " units, and a width of " + this.width + 
				" units.\n The cuboid has a surface area of " + surfaceArea() + " units squard and a volume of " + volume() + " units cubid.");
	}

	/**
	 * @return the depth
	 */
	public float getDepth() {
		return depth;
	}

	/**
	 * @param depth the depth to set
	 */
	public void setDepth(float depth) {
		this.depth = validationNumber(depth);
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

	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = validationNumber(width);
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
