/**
 * 
 */
package org.cvtc.shapes;

import org.cvtc.support.DialogOptions;

/**
 * @author Timothy M. Hartwig
 *
 * Created: Feb 28, 2019
 * Modified: 2019-02-28
 *
 */

enum ShapeType {
	Cuboid, Cylinder, Sphere
}

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
	
	public Shape make(ShapeType type) {
		dialog.setOptions(type);
		
		return (Shape) dialog.show();
	}
}
