/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Iimothy M. Hartwig
 *
 */
public abstract class Shape {
	protected static MessageBox messageBox;
	
	/**
	 * @param messageBox
	 */
	public Shape(MessageBox messageBox) {
		super();
		this.messageBox = messageBox;
	}

	/**
	 * @return the messageBox
	 */
	public Dialog getMessageBox() {
		return messageBox;
	}

	/**
	 * @param messageBox the messageBox to set
	 */
	public void setMessageBox(MessageBox messageBox) {
		this.messageBox = messageBox;
	}

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
}
