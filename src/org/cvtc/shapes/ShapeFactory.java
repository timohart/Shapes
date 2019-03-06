/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.cvtc.support.DialogOptions;

/**
 * @author Timothy M. Hartwig
 *
 * Created: Feb 28, 2019
 * Modified: 2019-02-28
 *
 */

public class ShapeFactory {
	private DialogOptions dialog;

	/**
	 * @param dialog
	 */
	public ShapeFactory(DialogOptions dialog) {
		super();
		this.dialog = dialog;
	}

	/**
	 * @return the dialog
	 */
	public DialogOptions getDialog() {
		return dialog;
	}

	/**
	 * @param dialog the dialog to set
	 */
	public void setDialog(DialogOptions dialog) {
		this.dialog = dialog;
	}
	
	/**
	 * @param  ShapeTypetype
	 * @return Shape
	 */
	public Shape make(ShapeType type) {
		MessageBox mb = new MessageBox();
		JFrame frame = new JFrame();
		
		switch(type) {
			case Cuboid :
				float cubeDepth = Float.valueOf(JOptionPane.showInputDialog(frame, "Enter depth:")); 
				float cubeHeight = Float.valueOf(JOptionPane.showInputDialog(frame, "Enter height:")); 
				float cubeWidth = Float.valueOf(JOptionPane.showInputDialog(frame, "Enter width:")); 
				
				return new Cuboid(mb, cubeDepth, cubeHeight, cubeWidth);
			case Cylinder :
				float cylinderHeight = Float.valueOf(JOptionPane.showInputDialog(frame, "Enter height:"));
				float cylibderRadias = Float.valueOf(JOptionPane.showInputDialog(frame, "Enter radias:"));
				
				return new Cylinder(mb, cylinderHeight, cylibderRadias);
			case Sphere :
				float sphereRadias = Float.valueOf(JOptionPane.showInputDialog(frame, "Enter radias:"));
				
				return new Sphere(mb, sphereRadias);
		}
		
		return null;
	}
}
