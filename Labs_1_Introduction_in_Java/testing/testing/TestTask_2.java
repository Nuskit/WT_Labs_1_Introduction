package testing;

import static org.junit.Assert.*;
import java.awt.Point;

import org.junit.Before;
import org.junit.Test;

import task_2.CheckPoint;

public class TestTask_2 {

	private CheckPoint checkPoint;

	@Before
	public void InitializeCheckPoint() {
		checkPoint = new CheckPoint();
	}

	@Test
	public void testIsInZone() {
		assertEquals(checkPoint.isInZone(new Point(-1, 2)), true);
		assertEquals(checkPoint.isInZone(new Point(0, 0)), true);
		assertEquals(checkPoint.isInZone(new Point(1, 2)), true);
		assertEquals(checkPoint.isInZone(new Point(0, -2)), true);
	}

	@Test
	public void testIsOutZone() {
		assertEquals(checkPoint.isInZone(new Point(0, 8)), false);
		assertEquals(checkPoint.isInZone(new Point(-8, 8)), false);
		assertEquals(checkPoint.isInZone(new Point(8, 0)), false);
		assertEquals(checkPoint.isInZone(new Point(8, 4)), false);
	}

}
