/**
 * 
 */
package org.cvtc.tests;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.junit.Test;

/**
 * @author Timothy M. Hartwig
 * 
 * Created on: Feb 9, 2019
 * Modified on: 2019-02-09
 *
 */
public class SphereTest {
	
	private Sphere sphere1 = new Sphere(1.0f);
	private Sphere sphere2 = new Sphere(2.0f);
	private Sphere sphere3 = new Sphere(3.0f);

	/**
	 * Test method for {@link org.cvtc.shapes.Sphere#surfaceArea()}.
	 */
	@Test
	public void testSurfaceArea1() {
		assertEquals(sphere1.surfaceArea(), 12.566370f, 0.1);
	}
	
	@Test
	public void testSurfaceArea2() {
		assertEquals(sphere2.surfaceArea(), 50.26548f, 0.1);
	}
	
	@Test
	public void testSurfaceArea3() {
		assertEquals(sphere3.surfaceArea(), 113.09734f, 0.1);
	}

	/**
	 * Test method for {@link org.cvtc.shapes.Sphere#volume()}.
	 */
	@Test
	public void testVolume1() {
		assertEquals(sphere1.volume(), 4.18879f, 0.1);
	}
	
	@Test
	public void testVolume2() {
		assertEquals(sphere2.volume(), 33.510320f, 0.1);
	}
	
	@Test
	public void testVolume3() {
		assertEquals(sphere3.volume(), 113.09734f, 0.1);
	}

	/**
	 * Test method for {@link org.cvtc.shapes.Sphere#Sphere(float)}.
	 */
	@Test
	public void testSphere() {
		Sphere s = new Sphere(-1.0f);
		assertEquals(s.getRadius(), 1.0f, 0.0);
	}

	/**
	 * Test method for {@link org.cvtc.shapes.Sphere#getRadius()}.
	 */
	@Test
	public void testGetRadius() {
		assertEquals(sphere1.getRadius(), 1.0f, 0.0);
	}

}
