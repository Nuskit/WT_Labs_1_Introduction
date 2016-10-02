package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import task_1.FindFunction;

public class TestTask_1 {	
	@Test
	public void testCalculate() {
		FindFunction findFunction = new FindFunction();
		assertEquals(findFunction.calculate(5, 6), 5.286, 0.001);
		assertEquals(findFunction.calculate(-1, 1), -0.5, 0.001);
		assertEquals(findFunction.calculate(0, 0), 0.5, 0.001);
	}

}
