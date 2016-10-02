package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import task_11.Book;

public class TestTask_11 {

	private Book firstBook;
	
	@Before
	public void setBook(){
		firstBook=new Book("Sequeue", "Jorgh", 123);
	}
	
	@Test
	public void testEquals() {
		Book secondBook=new Book("Dequeue", "Jorgh", 123);
		assertTrue(firstBook.equals(firstBook));
		assertFalse(firstBook.equals(secondBook));
		assertFalse(firstBook.equals(null));
	}
	
	@Test
	public void testToString(){
		assertEquals(firstBook.toString(), String.format(
				"Book title=%s, author=%s, price=%d, edition=%d\n",
				firstBook.getTitle(),firstBook.getAuthor(),firstBook.getPrice(),0));
	}
}
