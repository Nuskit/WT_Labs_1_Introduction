package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import task_5.MinSequence;
import task_5.MinSequenceValue;

public class TestTask_5 {

	@Test
	public void test() {
		MinSequence minSequence = new MinSequence();
		assertEquals(minSequence.foundMinSequence(new int[] { 1, 2, 3 }), new MinSequenceValue(0, 1));
		assertEquals(minSequence.foundMinSequence(new int[] { 1, 2, 1, 4 }), new MinSequenceValue(2, 2));
		assertEquals(minSequence.foundMinSequence(new int[] { 5, 4, 3, 2, 1 }), new MinSequenceValue(4, 5));
		assertEquals(minSequence.foundMinSequence(new int[] { 5, 4, 3, 4, 1 }), new MinSequenceValue(4, 4));
	}

}
