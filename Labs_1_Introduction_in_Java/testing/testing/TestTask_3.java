package testing;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import task_3.ShowAsTable;
import task_3.ShowInTableFunction;

public class TestTask_3 {

	@Test
	public void testGenerateResultFuncion() {
		ShowInTableFunction showInTableFunction = new ShowInTableFunction(new ShowAsTable());
		assertEqualsMapEpsilon(showInTableFunction.generateResultFunction(0.0, 1.0, 0.25), 
				new HashMap<Double, Double>() {
			{
				put(0.0, 0.0);
				put(0.25, 0.255);
				put(0.5, 0.546);
				put(0.75, 0.931);
			}
		}, 0.001);
	}

	private static void assertEqualsMapEpsilon(HashMap<Double, Double> expected, HashMap<Double, Double> actual,
			double epsilon) {
		assertEquals(expected.size(), actual.size());
		for (Map.Entry<Double, Double> value : expected.entrySet()) {
			Double actualValue = actual.get(value.getKey());
			assertEquals(value.getValue(), actualValue, epsilon);
		}
	}

}
