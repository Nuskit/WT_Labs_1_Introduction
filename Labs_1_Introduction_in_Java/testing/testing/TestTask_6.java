package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import task_6.GenerateMatrix;

public class TestTask_6 {

	@Test
	public void testGenerate() {
		GenerateMatrix generateMatrix = new GenerateMatrix();
		assertArrayArraysEquals(generateMatrix.generate(1, 2, 3), new double[][] 
				{ { 1, 2 ,3 }, 
				  { 2, 3, 1 },
				  { 3, 1, 2 }
				}, 0.001);
	}

	private void assertArrayArraysEquals(final double[][] expected, final double[][] actual, double epsilon) {
		if (expected.length != actual.length)
			fail();
		for (int i = 0; i < expected.length; i++) {
			assertArrayEquals(expected[i], actual[i], epsilon);
		}
	}
}
