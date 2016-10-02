package task_15;

import java.util.Comparator;

import task_11.Book;

public class ComparatorBook extends Book {

	public static Comparator<Book> title = new ComparatorBook.CompareTitle();
	public static Comparator<Book> authorAndTitle = new ComparatorBook.CompareAuthorAndTitle();
	public static Comparator<Book> titleAndAuthor = new ComparatorBook.CompareTitleAndAuthor();
	public static Comparator<Book> authorAndTitleAndPrice = new ComparatorBook.CompareAuthorAndTitleAndPrice();
	private static Comparator<Book> author = new ComparatorBook.CompareAuthor();
	private static Comparator<Book> price = new ComparatorBook.ComparePrice();

	public ComparatorBook(String title, String author, int price) {
		super(title, author, price);
	}

	private static class CompareAuthor implements Comparator<Book> {
		@Override
		public int compare(Book left, Book right) {
			return left.getAuthor().compareTo(right.getAuthor());
		}
	}

	private static class CompareTitle implements Comparator<Book> {
		@Override
		public int compare(Book left, Book right) {
			return left.getTitle().compareTo(right.getTitle());
		}
	}

	private static class ComparePrice implements Comparator<Book> {
		@Override
		public int compare(Book left, Book right) {
			return Integer.compare(left.getPrice(), right.getPrice());
		}
	}

	private static class CompareTitleAndAuthor implements Comparator<Book> {
		@Override
		public int compare(Book left, Book right) {
			return title.compare(left, right) == 0 ? author.compare(left, right) : title.compare(left, right);
		}
	}

	private static class CompareAuthorAndTitle implements Comparator<Book> {
		@Override
		public int compare(Book left, Book right) {
			return author.compare(left, right) == 0 ? title.compare(left, right) : author.compare(left, right);
		}
	}

	private static class CompareAuthorAndTitleAndPrice implements Comparator<Book> {
		@Override
		public int compare(Book left, Book right) {
			return author.compare(left, right) == 0
					? title.compare(left, right) == 0 ? price.compare(left, right) : title.compare(left, right)
					: author.compare(left, right);
		}
	}
}