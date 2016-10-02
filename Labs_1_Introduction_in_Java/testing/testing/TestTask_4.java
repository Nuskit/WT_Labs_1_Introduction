package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import task_4.CheckArrayForPrimeElements;

public class TestTask_4 {

	@Test
	public void testFoundPrimePosition() {
		CheckArrayForPrimeElements checkPrimeElements = new CheckArrayForPrimeElements();
		assertEquals(
				(ArrayList<Integer>) checkPrimeElements.getPrimeNumberPosition(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
				new ArrayList<Integer>() {
					{
						add(2);
						add(3);
						add(5);
						add(7);
					}
				});
	}
}
