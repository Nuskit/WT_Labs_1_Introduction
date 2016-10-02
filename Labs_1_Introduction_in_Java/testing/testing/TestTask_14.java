package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import task_14.ComparableBook;

public class TestTask_14 {

	private ComparableBook firstBook;

	@Before
	public void setBook() {
		firstBook = new ComparableBook("Sequeue", "Jorgh", 123, 15);
	}

	@Test
	public void testComparable() {
		ComparableBook secondBook = new ComparableBook("Sequeue", "Jorgh", 123, 17);
		assertEquals(firstBook.compareTo(secondBook),Integer.compare(15, 17));
	}
}
