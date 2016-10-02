package testing;
import static org.junit.Assert.*;

import org.junit.Test;

import task_7.ShellSorted;

public class TestTask_7 {

	@Test
	public void testSort() {
		ShellSorted shellSorted=new ShellSorted();
		double testArray[]=new double[]{5,3,2,7,1,7,2,1};
		shellSorted.sort(testArray);
		assertArrayEquals(testArray,
				new double[]{
						1,1,2,2,3,5,7,7
				},0.001);
	}
}
