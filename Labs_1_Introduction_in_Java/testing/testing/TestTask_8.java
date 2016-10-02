package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import task_8.UpSequence;

public class TestTask_8 {

	@Test
	public void testInsertPosition() {
		UpSequence upSequence=new UpSequence();
		assertArrayEquals(upSequence.insertPosition(
				new double[]{1,3,5,7}, 
				new double[]{1,2,2,4,6,8}),
				new int[]{0,1,1,2,3,4});
	}

}
