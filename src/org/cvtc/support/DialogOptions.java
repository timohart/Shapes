/**
 * 
 */
package org.cvtc.support;

import javax.swing.JOptionPane;

/**
 * @author Timothy M. Hartwig
 *
 * Created: Feb 28, 2019
 * Modified: 2019-02-28
 *
 */
public class DialogOptions {
	private Object[] options;
	private String message;
	private String title;
	
	/**
	 * @param options
	 * @param message
	 * @param title
	 */
	public DialogOptions(Object[] options, String message, String title) {
		super();
		this.message = message;
		this.title = title;
	}

	/**
	 * @return the options
	 */
	public Object[] getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(Object[] options) {
		this.options = options;
	}


	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Object show() {
		return JOptionPane.showInputDialog(null,
                message,
                title,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                this.options[0]);
	}
}
