/**
 * 
 */
package org.cvtc.tests;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.junit.Test;

/**
 * @author Timothy M. Hartwig
 * 
 * Created on: Feb 8, 2019
 * Modified on: 2019-02-08
 *
 */
public class CylinderTest {
	
	private Cylinder tube1 = new Cylinder(1.0f, 1.0f);
	private Cylinder tube2 = new Cylinder(2.0f, 2.0f);
	private Cylinder tube3 = new Cylinder(3.0f, 3.0f);

	/**
	 * Test methods for {@link org.cvtc.shapes.Cylinder#surfaceArea()}.
	 */
	@Test
	public void testSurfaceArea1() {
		assertEquals(tube1.surfaceArea(), 12.56637f, 0.1);
	}
	
	@Test
	public void testSurfaceArea2() {
		assertEquals(tube2.surfaceArea(), 50.26548f, 0.1);
	}
	
	@Test
	public void testSurfaceArea3() {
		assertEquals(tube3.surfaceArea(), 113.09734f, 0.1);
	}

	/**
	 * Test methods for {@link org.cvtc.shapes.Cylinder#volume()}.
	 */
	@Test
	public void testVolume1() {
		assertEquals(tube1.volume(), 3.1415927f, 0.1);
	}
	
	@Test
	public void testVolume2() { 
		assertEquals(tube2.volume(), 25.13274f, 0.1);
	}
	
	@Test
	public void testVolume3() {
		assertEquals(tube3.volume(), 84.823f, 0.1);
	}
	
	/**
	 * Test method for {@link org.cvtc.shapes.Cylinder#Cylinder(float, float)}.
	 */
	@Test
	public void testCylinder() {
		Cylinder c = new Cylinder(-1.5F, -1.5f);
		assertEquals(c.getHeight(), 1.0F, 0.0);
		assertEquals(c.getRadius(), 1.0f, 0.0);
	}

	/**
	 * Test method for {@link org.cvtc.shapes.Cylinder#getRadius()}.
	 */
	@Test
	public void testGetRadius() {
		assertEquals(tube1.getRadius(), 1.0f, 0.0);
	}

	/**
	 * Test method for {@link org.cvtc.shapes.Cylinder#getHeight()}.
	 */
	@Test
	public void testGetHeight() {
		assertEquals(tube1.getHeight(), 1.0f, 0.0);
	}

}
