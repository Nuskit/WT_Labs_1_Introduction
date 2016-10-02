package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import task_11.Book;
import task_15.ComparatorBook;

public class TestTask_15 {

	private Book firstBook;
	private Book secondBook;
	private Book thirdBook;
	private Book fourthBook;

	@Before
	public void setBook() {
		firstBook = new Book("Seqeue", "Jon", 1);
		secondBook = new Book("Deqeue", "Jons", 3);
		thirdBook = new Book("Seqeue", "Joni", 1);
		fourthBook = new Book("Deqeue", "Jons", 1);
	}

	@Test
	public void testTitleComparator() {
		assertEquals(getSign(ComparatorBook.title.compare(firstBook, secondBook)), 1);
		assertEquals(getSign(ComparatorBook.title.compare(firstBook, thirdBook)), 0);
	}

	@Test
	public void testTitleAndAuthorComparator() {
		assertEquals(getSign(ComparatorBook.titleAndAuthor.compare(firstBook, secondBook)), 1);
		assertEquals(getSign(ComparatorBook.titleAndAuthor.compare(firstBook, thirdBook)), -1);
	}

	@Test
	public void testAuthorAndTitleComparator() {
		assertEquals(getSign(ComparatorBook.authorAndTitle.compare(firstBook, secondBook)), -1);
		assertEquals(getSign(ComparatorBook.authorAndTitle.compare(thirdBook, firstBook)), 1);
	}

	@Test
	public void testAuthorTitleAndPriceComparator() {
		assertEquals(getSign(ComparatorBook.authorAndTitle.compare(firstBook, fourthBook)), -1);
		assertEquals(getSign(ComparatorBook.authorAndTitle.compare(secondBook, thirdBook)), 1);
		assertEquals(getSign(ComparatorBook.authorAndTitle.compare(fourthBook, thirdBook)), 1);
	}

	private int getSign(int value) {
		return Integer.signum(value);
	}
}
