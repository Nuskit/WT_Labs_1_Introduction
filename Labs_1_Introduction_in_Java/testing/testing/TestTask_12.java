package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import task_12.ProgrammerBook;

public class TestTask_12 {

	private ProgrammerBook firstBook;
	
	@Before
	public void setBook(){
		firstBook=new ProgrammerBook("Sequeue", "Jorgh", 123,"ru",5);
	}
	
	@Test
	public void testEquals() {
		ProgrammerBook secondBook=new ProgrammerBook("Dequeue", "Jorgh", 123,"ru",6);
		assertTrue(firstBook.equals(firstBook));
		assertFalse(firstBook.equals(secondBook));
		assertFalse(firstBook.equals(null));
	}
	
	@Test
	public void testToString(){
		assertEquals(firstBook.toString(), String.format(
				"ProgrammerBook title=%s, author=%s, price=%d, edition=%d, language=%s, level=%d\n",
				firstBook.getTitle(),firstBook.getAuthor(),firstBook.getPrice(),0,firstBook.getLanguage(),firstBook.getLevel()));
	}
}
