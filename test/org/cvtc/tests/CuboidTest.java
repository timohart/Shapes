/**
 * 
 */
package org.cvtc.tests;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.MessageBox;
import org.junit.Test;

/**
 * @author Timothy M. Hartwig
 * 
 * Created on: Feb 8, 2019
 * Modified on: 2019-02-18
 *
 */
public class CuboidTest {
	private MessageBox messageBox = new MessageBox();
	
	private Cuboid cube1 = new Cuboid(messageBox, 1.0f, 1.0f, 1.0f);
	private Cuboid cube2 = new Cuboid(messageBox, 2.0f, 2.0f, 2.0f);
	private Cuboid cube3 = new Cuboid(messageBox, 3.0f, 3.0f, 3.0f);

	/**
	 * Test methods for {@link org.cvtc.shapes.Cuboid#surfaceArea()}.
	 */
	@Test
	public void testSurfaceArea1() {
		assertEquals(cube1.surfaceArea(), 6.0f, 0.0);
	}
	
	@Test
	public void testSurfaceArea2() {
		assertEquals(cube2.surfaceArea(), 24.0f, 0.0);
	}
	
	@Test
	public void testSurfaceArea3() {
		assertEquals(cube3.surfaceArea(), 54.0f, 0.0);
	}

	/**
	 * Test methods for {@link org.cvtc.shapes.Cuboid#volume()}.
	 */
	@Test
	public void testVolume1() {
		assertEquals(cube1.volume(), 1.0f, 0.0);
	}
	
	@Test
	public void testVolume2() {
		assertEquals(cube2.volume(), 8.0f, 0.0);
	}
	
	@Test
	public void testVolume3() {
		assertEquals(cube3.volume(), 27.0f, 0.0);
	}

	/**
	 * Test method for {@link org.cvtc.shapes.Cuboid#Cuboid(float, float, float)}.
	 */
	@Test
	public void testCuboid() {
		Cuboid c = new Cuboid(messageBox, -2.0f, -2.0f, -2.0f);
		assertEquals(c.getDepth(), 1.0f, 0.0);
		assertEquals(c.getHeight(), 1.0f, 0.0);
		assertEquals(c.getWidth(), 1.0f, 0.0);
	}

	/**
	 * Test method for {@link org.cvtc.shapes.Cuboid#getDepth()}.
	 */
	@Test
	public void testGetDepth() {
		assertEquals(cube1.getDepth(), 1.0f, 0.0);
	}

	/**
	 * Test method for {@link org.cvtc.shapes.Cuboid#getHeight()}.
	 */
	@Test
	public void testGetHeight() {
		assertEquals(cube1.getHeight(), 1.0f, 0.0);
	}

	/**
	 * Test method for {@link org.cvtc.shapes.Cuboid#getWidth()}.
	 */
	@Test
	public void testGetWidth() {
		assertEquals(cube1.getWidth(), 1.0f, 0.0);
	}

}
