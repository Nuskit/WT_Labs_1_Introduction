package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import task_13.CloneBook;

public class TestTask_13 {

	private CloneBook firstBook;

	@Before
	public void setBook() {
		firstBook = new CloneBook("Sequeue", "Jorgh", 123);
	}

	@Test
	public void testClone() {
		CloneBook secondBook = firstBook.clone();
		assertFalse(firstBook == secondBook);
		assertEquals(firstBook, secondBook);
	}

}
