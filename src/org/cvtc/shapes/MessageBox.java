/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Timothy M. Hartwig
 *
 * Created: Feb 14, 2019
 * Modified: 2019-02-14
 *
 */
public class MessageBox implements Dialog {
	/**
	 * 
	 */
	public MessageBox() {
	}

	/* (non-Javadoc)
	 * @see org.cvtc.shapes.Dialog#show(java.lang.String, java.lang.String)
	 */
	@Override
	public int show(String message, String title) {
		JOptionPane.showMessageDialog (null, message, title, 1);
		return 0;
	}
}
