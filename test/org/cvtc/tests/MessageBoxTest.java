/**
 * 
 */
package org.cvtc.tests;

import static org.junit.Assert.*;

import org.cvtc.shapes.MessageBox;
import org.junit.Test;

/**
 * @author Timothy M. Hartwig
 *
 * Created: Feb 18, 2019
 * Modified: 2019-02-18
 *
 */
public class MessageBoxTest {

	/**
	 * Test method for {@link org.cvtc.shapes.MessageBox#show(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testShow() {
		MessageBox mb = new MessageBox();
		assertEquals(mb.show("0x00", "0x00"), 0, 0.0);
	}

}
